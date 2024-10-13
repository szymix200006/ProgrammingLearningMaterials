package wisniowa.tc.SecondGroup.Mediator;

public class KomponentC implements Komponent{
    private static Mediator mediator;


    public KomponentC() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void wyslijKomunikat(String wiadomosc) {
        System.out.println("KomponentC wysyla komunikat: " + wiadomosc);
        mediator.przkazWiadomosc(wiadomosc, this);
    }

    @Override
    public void odbierzKomuniat(String wiadomosc, Komponent nadawaca) {
        System.out.println("KomponentC odbiera wiadomosc od: " + nadawaca.getClass().getSimpleName() + ":" + wiadomosc);
    }
}