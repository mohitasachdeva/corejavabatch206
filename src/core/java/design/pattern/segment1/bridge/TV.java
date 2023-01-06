package core.java.design.pattern.segment1.bridge;

public abstract class TV {
    Remote remote;
   public TV(Remote r){
        this.remote=r;
    }
    abstract void on();
   abstract void off();
}
