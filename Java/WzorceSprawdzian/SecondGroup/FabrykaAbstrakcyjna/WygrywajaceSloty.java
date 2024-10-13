package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class WygrywajaceSloty extends Sloty{

    public WygrywajaceSloty (String name){
        super(name);
    }
    @Override
    public void zagraj() {
        wynik();
    }

    @Override
    public void wynik() {
        System.out.println("JACKPOT!!! WYGRALES 100000000zl");
    }
}
