package core.java.design.pattern.segment1.bridge;

public class SonyTV  extends TV {
    Remote remoteType;
    SonyTV(Remote r){
        super(r);
        this.remoteType = r;

    }

    @Override
    void on() {
        System.out.println(" on the sony tv");
    }

    @Override
    void off() {
        System.out.println("off the sony tv");
    }
}
