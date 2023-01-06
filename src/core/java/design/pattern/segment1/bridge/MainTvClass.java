package core.java.design.pattern.segment1.bridge;

import core.java.design.pattern.segment1.bridge.*;

public class MainTvClass {
    public static void main(String[] args) {
        TV old = new SonyTV(new OLdRemote());
        old.on();
        old.off();
        System.out.println();
        TV newRemote = new SonyTV(new NewRemote());
        newRemote.on();
        newRemote.off();
        System.out.println();
        TV oldPhilips = new Philips(new OLdRemote());
        newRemote.on();
        newRemote.off();
        System.out.println();
        TV newPhilips = new Philips(new NewRemote());
        newPhilips.on();
        newPhilips.off();
        System.out.println();
    }
}