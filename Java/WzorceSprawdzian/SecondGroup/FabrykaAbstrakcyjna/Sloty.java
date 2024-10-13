package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public abstract class Sloty {
    private String name;

    public Sloty(String name){
        this.name = name;
    }

    public abstract void zagraj();
    public abstract void wynik();
}
