package wisniowa.tc.SecondGroup.Decorator;

public class AsdDEcorator extends DataSourceDecorator{
    public AsdDEcorator(DataSource wrapee) {
        super(wrapee);
    }

    @Override
    public String readData() {
        return "asd";
    }
}
