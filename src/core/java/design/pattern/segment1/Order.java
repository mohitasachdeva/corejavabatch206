package core.java.design.pattern.segment1;

public class Order {
    public static Laptop get(String str){
        if(str.equals("Orders")){
           return new HPLaptop();
        } else if (str.equals("Expansive")) {
            return new AppleLaptop();
        }
        else {
            return new DellLaptop();
        }
    }
}
