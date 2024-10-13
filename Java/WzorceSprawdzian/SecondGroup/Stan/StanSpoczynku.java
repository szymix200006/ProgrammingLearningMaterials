package wisniowa.tc.SecondGroup.Stan;

public class StanSpoczynku implements Stan{
    @Override
    public void doAction(Kawomat kawomat) {
        System.out.println("Jestem w spoczynku");
        kawomat.setStan(new StanParzenia());
    }
}
