package wisniowa.tc.SecondGroup.MetodaWytwórcza;

public class FabrykaZabkobusuw extends Fabryka{
    @Override
    Pojazd zrobPojazd() {
        return new Zabkobus();
    }
}
