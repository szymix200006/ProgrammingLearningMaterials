package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class PrzegrywajaceKasynko implements Kasynko{

    private Harty harty = new PrzegrywajaceHarty("niefajneharty");
    private Sloty sloty = new PrzegywajaceSloty("niefajnesloty");
    @Override
    public void obstawHarty() {
        harty.zagraj();
    }

    @Override
    public void obstawSloty() {
        sloty.zagraj();
    }
}
