package core.java.design.pattern.segment1;

public class Shapes extends AllShapes{
    @Override
    ShapeFactory getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else
        {
            return new Circle();
        }

    }


}

