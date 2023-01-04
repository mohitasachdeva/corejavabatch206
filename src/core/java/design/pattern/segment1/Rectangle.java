package core.java.design.pattern.segment1;

public class Rectangle implements  ShapeFactory{
    @Override
    public String toString() {
        return "Rectangle{}";
    }

    @Override
    public void draw() {
        System.out.println("shape OF the rectangle");

    }
}
