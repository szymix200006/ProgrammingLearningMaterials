package wisniowa.tc.FirstGroup.Visitor.Workers;

import wisniowa.tc.FirstGroup.Visitor.Interfaces.Wages;

public class Tester extends OfficeWorker {
    public Tester(int id, String name) {
        super(id, name);
    }

    @Override
    public void accept(Wages w) {
        w.acceptTester(this);
    }
}
