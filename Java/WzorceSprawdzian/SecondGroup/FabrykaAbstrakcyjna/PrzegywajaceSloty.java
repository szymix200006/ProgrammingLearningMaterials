package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class PrzegywajaceSloty extends Sloty{

    public PrzegywajaceSloty(String name){
        super(name);
    }
    @Override
    public void zagraj() {
        wynik();
    }

    @Override
    public void wynik() {
        System.out.println("BYLO BLISKO !! GRAJ DALEJ!!!!");
    }
}
