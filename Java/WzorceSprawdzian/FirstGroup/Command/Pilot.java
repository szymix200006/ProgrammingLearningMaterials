package wisniowa.tc.FirstGroup.Command;

public class Pilot {
    private Polecenie polecenie;

    public void setPolecenie(Polecenie polecenie){
        this.polecenie = polecenie;
    }

    public void wcisnijPrzycisk(){
        polecenie.wykonaj();
    }
}
