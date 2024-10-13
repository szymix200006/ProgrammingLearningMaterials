package wisniowa.tc.FirstGroup.Command;

public class Wlacz implements Polecenie{
    private Urzadzenie urzadzenie;

    public Wlacz(Urzadzenie urzadzenie) {
        this.urzadzenie = urzadzenie;
    }

    public void wykonaj() {
        urzadzenie.wlacz();
    }
}
