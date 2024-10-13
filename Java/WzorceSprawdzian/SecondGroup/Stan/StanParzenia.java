package wisniowa.tc.SecondGroup.Stan;

public class StanParzenia implements Stan{
    @Override
    public void doAction(Kawomat kawomat) {
        System.out.println("Parze kawusie");
        kawomat.setStan(new StanWydawania());
    }
}
