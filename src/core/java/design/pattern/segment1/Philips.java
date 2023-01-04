package core.java.design.pattern.segment1;

public class Philips extends TV{
    Remote remoteType;
    Philips(Remote remoteType) {
        super(remoteType);
        this.remoteType =remoteType;
    }
    @Override
    void on() {
        System.out.println("Philips tv on");
    }

    @Override
    void off() {
        System.out.println("philips tv off");
    }
}
