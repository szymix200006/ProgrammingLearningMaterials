package wisniowa.tc.SecondGroup.MetodaWytwórcza;

public class FabrykaCzolguw extends Fabryka{
    @Override
    Pojazd zrobPojazd() {
        return new Czolg();
    }
}
