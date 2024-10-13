package wisniowa.tc.SecondGroup.MetodaWytwórcza;

public abstract class Fabryka {
    abstract Pojazd zrobPojazd();

    public void zrobCos(){
        Pojazd pojazd = zrobPojazd();
        pojazd.jedz();
        pojazd.zepsujSie();
    }
}
