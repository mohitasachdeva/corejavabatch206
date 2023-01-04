package core.java.design.pattern.segment1;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ludo ludo = new Ludo();
        ludo.setgName("ludo");
        System.out.println(ludo.getgName());
        ludo.playGame();
        Ludo ludo1 = (Ludo) ludo.clone();
        ludo1.setgName("NEw Ludo");
        System.out.println(ludo1.getgName());

    }
}
