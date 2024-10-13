package wisniowa.tc.SecondGroup.Mediator;

public class KonkretnyMediator implements Mediator{
    private Komponent komponentA;
    private Komponent komponentB;
    private Komponent komponentC;



    public void zarejestrujKomponenty(Komponent komponentA, Komponent komponentB, Komponent komponentC) {
        this.komponentA = komponentA;
        this.komponentB = komponentB;
        this.komponentC = komponentC;
    }


    @Override
    public void przkazWiadomosc(String wiadomosc, Komponent nadawca) {
        if (nadawca == komponentA) {
            komponentB.odbierzKomuniat(wiadomosc, nadawca);
        } else if (nadawca == komponentB) {
            komponentA.odbierzKomuniat(wiadomosc,nadawca);
        } else if (nadawca == komponentC) {
            komponentB.odbierzKomuniat(wiadomosc,nadawca);
            komponentA.odbierzKomuniat(wiadomosc, nadawca);
        }
    }
}
