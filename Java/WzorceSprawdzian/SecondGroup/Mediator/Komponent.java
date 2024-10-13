package wisniowa.tc.SecondGroup.Mediator;

public interface Komponent {
    void setMediator(Mediator mediator);
    void wyslijKomunikat(String wiadomosc);
    void odbierzKomuniat(String wiadomosc, Komponent nadawaca);
}
