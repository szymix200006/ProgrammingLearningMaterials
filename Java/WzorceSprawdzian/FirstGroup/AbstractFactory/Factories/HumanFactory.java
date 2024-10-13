package wisniowa.tc.FirstGroup.AbstractFactory.Factories;

import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Czlowiek;
import wisniowa.tc.FirstGroup.AbstractFactory.Creatures.Dziecko;

public interface HumanFactory
{
    public abstract Czlowiek CreateHuman();
    public abstract Dziecko CreateChild();
}
