package core.java.design.pattern.segment1.reflection;

public class NewInstance {
    public void show(){
        System.out.println("hello world");
    }
}
class UseNewInstance{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("core.java.practice.day1.NewInstance");
        NewInstance n= (NewInstance)c.newInstance();
        n.show();

    }
}
