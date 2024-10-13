package wisniowa.tc.FirstGroup.Visitor.Interfaces;

import wisniowa.tc.FirstGroup.Visitor.Workers.Manager;
import wisniowa.tc.FirstGroup.Visitor.Workers.OfficeWorker;
import wisniowa.tc.FirstGroup.Visitor.Workers.Programmer;
import wisniowa.tc.FirstGroup.Visitor.Workers.Tester;

public class WorkersWages implements Wages {
    public void export(OfficeWorker... ow) {
        for (OfficeWorker w : ow) {
            w.accept(this);
        }
    }

    @Override
    public void acceptManager(Manager m) {
        System.out.println("Id pracownika: " + m.getId());
        System.out.println("Imię pracownika: " + m.getName());
        System.out.println("Zarobki: 30 000 PLN");
    }

    @Override
    public void acceptProgrammer(Programmer p) {
        System.out.println("Id pracownika: " + p.getId());
        System.out.println("Imię pracownika: " + p.getName());
        System.out.println("Zarobki: 15 000 PLN");
    }

    @Override
    public void acceptTester(Tester t) {
        System.out.println("Id pracownika: " + t.getId());
        System.out.println("Imię pracownika: " + t.getName());
        System.out.println("Zarobki: 10 000 PLN");
    }
}
