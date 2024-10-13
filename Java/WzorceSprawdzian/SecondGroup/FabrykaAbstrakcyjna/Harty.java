package wisniowa.tc.SecondGroup.FabrykaAbstrakcyjna;

public abstract class Harty {
    private String name;

    public Harty(String name){
        this.name = name;
    }

    public abstract void zagraj();
    public abstract void wynik();
}
