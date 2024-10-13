package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class WygrywajaceHarty extends Harty{
    @Override
    public void zagraj() {
        wynik();
    }

    @Override
    public void wynik() {
        System.out.println("TWOJ HART WGRALLL!!!!!!!");
    }

    public WygrywajaceHarty(String name){
        super(name);
    }
}
