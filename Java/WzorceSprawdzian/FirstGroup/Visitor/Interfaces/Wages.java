package wisniowa.tc.FirstGroup.Visitor.Interfaces;

import wisniowa.tc.FirstGroup.Visitor.Workers.Manager;
import wisniowa.tc.FirstGroup.Visitor.Workers.Programmer;
import wisniowa.tc.FirstGroup.Visitor.Workers.Tester;

public interface Wages {
    public void acceptProgrammer(Programmer p);

    public void acceptTester(Tester t);

    public void acceptManager(Manager m);
}
