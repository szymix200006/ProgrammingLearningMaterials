package wisniowa.tc.FirstGroup.AbstractFactory.Creatures;

public class Alkoholik implements Czlowiek
{
    @Override
    public void SayHello()
    {
        System.out.println("Czesc, jestem alkoholikiem");
    }

    @Override
    public void SayGoodbye()
    {
        System.out.println("Do widzenia, jestem alkoholikiem");
    }
}
