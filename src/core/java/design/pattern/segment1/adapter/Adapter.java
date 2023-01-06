package core.java.design.pattern.segment1.adapter;

public class Adapter implements ToyDuck {
    Bird bird;
    public Adapter(Bird bird)
        {
            // we need reference to the object we
            // are adapting
            this.bird = bird;
        }
    @Override
        public void squeak()
        {

            bird.makeSound();
        }
    }

