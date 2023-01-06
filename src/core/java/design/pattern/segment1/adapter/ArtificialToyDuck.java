package core.java.design.pattern.segment1.adapter;

import core.java.design.pattern.segment1.adapter.ToyDuck;

public class ArtificialToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
