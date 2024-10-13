package wisniowa.tc.FirstGroup.AbstractFactory.Factories;

import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Alkoholik;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Czlowiek;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Dziecko;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Niemowlak;

public class GoodPeopleFactory implements HumanFactory
{
    @Override
    public Czlowiek CreateHuman()
    {
        return new Alkoholik();
    }

    @Override
    public Dziecko CreateChild()
    {
        return new Niemowlak();
    }
}
