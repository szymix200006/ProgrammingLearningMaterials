package wisniowa.tc.FirstGroup.Visitor.Workers;

import wisniowa.tc.FirstGroup.Visitor.Interfaces.Wages;

public interface Worker {
    public void accept(Wages w);
}
