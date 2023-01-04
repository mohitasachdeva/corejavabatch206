package core.java.design.pattern.segment1;

public class Circle implements ShapeFactory{
    @Override
    public void draw() {
        System.out.println("shape of the circle");
    }
}
