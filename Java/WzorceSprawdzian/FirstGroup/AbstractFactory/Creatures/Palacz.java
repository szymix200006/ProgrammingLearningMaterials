package wisniowa.tc.FirstGroup.AbstractFactory.Creatures;

public class Palacz implements Czlowiek
{
    @Override
    public void SayHello()
    {
        System.out.println("Czesc, jestem palaczem");
    }

    @Override
    public void SayGoodbye()
    {
        System.out.println("Do widzenia, jestem palaczem");
    }
}
