package wisniowa.tc.FirstGroup.AbstractFactory.Creatures;

public class Niemowlak implements Dziecko
{
    @Override
    public void SayHello()
    {
        System.out.println("Czesc, jestem niemowlakiem");
    }

    @Override
    public void SayGoodbye()
    {
        System.out.println("Do widzenia, jestem niemowlakiem");
    }
}
