package wisniowa.tc.SecondGroup.MetodaWytwórcza;

public class Czolg implements Pojazd{
    int amunicja;
    int numer;
    int dziala;

    @Override
    public void zepsujSie() {
        System.out.println("Ten czoug nie jedzie");
    }

    @Override
    public void jedz() {
        System.out.println("Ten czoug jedzie");
    }
}
