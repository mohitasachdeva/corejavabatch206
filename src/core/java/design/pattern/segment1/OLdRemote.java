package core.java.design.pattern.segment1;

public class OLdRemote implements  Remote{
    @Override
    public void on() {
        System.out.println("on with old remote");
    }

    @Override
    public void off() {
        System.out.println("off with old remote");
    }
}
