package wisniowa.tc.FirstGroup.AbstractFactory.Factories;

import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Czlowiek;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Dziecko;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Nastolatek;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Palacz;

public class BadPeopleFactory implements HumanFactory
{
    @Override
    public Czlowiek CreateHuman()
    {
        return new Palacz();
    }

    @Override
    public Dziecko CreateChild()
    {
        return new Nastolatek();
    }
}
