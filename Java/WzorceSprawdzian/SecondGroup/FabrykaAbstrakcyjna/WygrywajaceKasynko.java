package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class WygrywajaceKasynko implements Kasynko{

    private Harty harty = new WygrywajaceHarty("fajneharty");
    private Sloty sloty = new WygrywajaceSloty("fajnesloty");
    @Override
    public void obstawHarty() {
        harty.zagraj();
    }

    @Override
    public void obstawSloty() {
        sloty.zagraj();
    }
}
