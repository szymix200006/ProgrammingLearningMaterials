package wisniowa.tc.FirstGroup.Visitor.Workers;

import wisniowa.tc.FirstGroup.Visitor.Interfaces.Wages;

public class Manager extends OfficeWorker {
    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void accept(Wages w) {
        w.acceptManager(this);
    }
}
