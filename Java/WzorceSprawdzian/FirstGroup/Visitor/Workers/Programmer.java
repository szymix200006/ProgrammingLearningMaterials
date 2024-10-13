package wisniowa.tc.FirstGroup.Visitor.Workers;

import wisniowa.tc.FirstGroup.Visitor.Interfaces.Wages;

public class Programmer extends OfficeWorker {
    public Programmer(int id, String name) {
        super(id, name);
    }

    @Override
    public void accept(Wages w) {
        w.acceptProgrammer(this);
    }
}
