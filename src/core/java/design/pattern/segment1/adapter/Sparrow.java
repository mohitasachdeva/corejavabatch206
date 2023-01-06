package core.java.design.pattern.segment1.adapter;

import core.java.design.pattern.segment1.adapter.Bird;

class Sparrow implements Bird
{
    // a concrete implementation of bird
    public void fly()
    {
        System.out.println("Flying");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
}

