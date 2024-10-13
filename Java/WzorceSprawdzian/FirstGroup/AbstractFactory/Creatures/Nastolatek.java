package wisniowa.tc.FirstGroup.AbstractFactory.Creatures;

public class Nastolatek implements Dziecko
{
    @Override
    public void SayHello()
    {
        System.out.println("Czesc, jestem nastolatkiem");
    }

    @Override
    public void SayGoodbye()
    {
        System.out.println("Do widzenia, jestem nastolatkiem");
    }
}
