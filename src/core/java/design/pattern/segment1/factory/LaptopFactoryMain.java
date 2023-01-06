package core.java.design.pattern.segment1.factory;

public class LaptopFactoryMain {
    public static void main(String[] args) {
     Order order = new Order();
      Laptop laptop1 = order.get("Expansive");
       laptop1.getLaptop();


    }
}
