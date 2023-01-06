package core.java.design.pattern.segment1.adapter;

import core.java.design.pattern.segment1.adapter.Adapter;
import core.java.design.pattern.segment1.adapter.ArtificialToyDuck;
import core.java.design.pattern.segment1.adapter.Sparrow;
import core.java.design.pattern.segment1.adapter.ToyDuck;

public class MAinAdapter {
    public static void main(String[] args)
            {
                Sparrow sparrow = new Sparrow();
                ToyDuck toyDuck = new ArtificialToyDuck();

                // Wrap a bird in a birdAdapter so that it
                // behaves like toy duck
                ToyDuck birdAdapter = new Adapter(sparrow);

                System.out.println("Sparrow...");
                sparrow.fly();
                sparrow.makeSound();

                System.out.println("ToyDuck...");
                toyDuck.squeak();

                // toy duck behaving like a bird
                System.out.println("BirdAdapter...");
                birdAdapter.squeak();
            }
        }

