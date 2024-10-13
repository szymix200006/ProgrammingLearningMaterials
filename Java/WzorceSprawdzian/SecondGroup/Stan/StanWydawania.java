package wisniowa.tc.SecondGroup.Stan;

public class StanWydawania implements Stan{
    @Override
    public void doAction(Kawomat kawomat) {
        System.out.println("Wydaje kawe");
        kawomat.setStan(new StanSpoczynku());
    }
}
