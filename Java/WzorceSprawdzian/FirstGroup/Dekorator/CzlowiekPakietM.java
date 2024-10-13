package wisniowa.tc.FirstGroup.Dekorator;

public class CzlowiekPakietM implements ICzlowiek {
    ICzlowiek poprzedni;
    public CzlowiekPakietM(ICzlowiek poprzedni) {
        this.poprzedni = poprzedni;
    }
    @Override
    public void showInfo() {
        poprzedni.showInfo();
        System.out.println("Mam majtki i koszulke");
    }
}
