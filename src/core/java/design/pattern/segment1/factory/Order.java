package core.java.design.pattern.segment1.factory;

import core.java.design.pattern.segment1.factory.AppleLaptop;
import core.java.design.pattern.segment1.factory.DellLaptop;
import core.java.design.pattern.segment1.factory.HPLaptop;
import core.java.design.pattern.segment1.factory.Laptop;

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
