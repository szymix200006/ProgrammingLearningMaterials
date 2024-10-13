package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public class PrzegrywajaceHarty extends Harty{
    @Override
    public void zagraj() {
        wynik();
    }

    @Override
    public void wynik() {
        System.out.println("TWOJ HART SIE PRZEWROCIL!!!! :(");
    }

    public PrzegrywajaceHarty(String name){
        super(name);
    }
}
