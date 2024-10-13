package wisniowa.tc.SecondGroup.MetodaWytwórcza;

public class Zabkobus implements Pojazd{
    int miejsca;
    String numer;

    @Override
    public void zepsujSie() {
        System.out.println("Zabkobus zepsuł się");
    }

    @Override
    public void jedz() {
        System.out.println("kleklekle");
    }
}
