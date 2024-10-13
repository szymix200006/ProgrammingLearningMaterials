package wisniowa.tc.FirstGroup.Command;

public class Wylacz implements Polecenie{
    private Urzadzenie urzadzenie;

    public Wylacz(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    public void wykonaj() {
        urzadzenie.wylacz();
    }
}