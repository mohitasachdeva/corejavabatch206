package core.java.design.pattern.segment1;

public class MainShapeClass {
    public static void main(String[] args) {
      Shapes shapes = new Shapes();
      ShapeFactory shapeFactory = shapes.getShape("RECTANGLE");
      shapeFactory.draw();

    }
}
