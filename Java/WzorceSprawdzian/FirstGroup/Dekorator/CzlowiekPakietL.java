package wisniowa.tc.FirstGroup.Dekorator;

public class CzlowiekPakietL implements ICzlowiek {
    ICzlowiek poprzedni;
    public CzlowiekPakietL(ICzlowiek poprzedni) {
        this.poprzedni = poprzedni;
    }
    @Override
    public void showInfo() {
        poprzedni.showInfo();
        System.out.println("Mam kurtke");
    }
}