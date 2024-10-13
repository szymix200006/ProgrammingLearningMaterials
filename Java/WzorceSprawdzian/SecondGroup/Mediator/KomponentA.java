package wisniowa.tc.SecondGroup.Mediator;

public class KomponentA implements Komponent{
    private static Mediator mediator;


    public KomponentA() {
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void wyslijKomunikat(String wiadomosc) {
        System.out.println("KomponentA wysyla komunikat: " + wiadomosc);
        mediator.przkazWiadomosc(wiadomosc, this);
    }

    @Override
    public void odbierzKomuniat(String wiadomosc, Komponent nadawaca) {
        System.out.println("KomponentA odbiera wiadomosc od: " + nadawaca.getClass().getSimpleName() + ":" + wiadomosc);
    }
}
