package wisniowa.tc.SecondGroup.Mediator;

public class KomponentB implements Komponent{
    private static Mediator mediator;


    public KomponentB() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void wyslijKomunikat(String wiadomosc) {
        System.out.println("KomponentB wysyla komunikat: " + wiadomosc);
        mediator.przkazWiadomosc(wiadomosc, this);
    }

    @Override
    public void odbierzKomuniat(String wiadomosc, Komponent nadawaca) {
        System.out.println("KomponentB odbiera wiadomosc od: " + nadawaca.getClass().getSimpleName() + ":" + wiadomosc);
    }
}
