package wisniowa.tc.SecondGroup.Stan;

public class Kawomat {
    private Stan stan;

    public Kawomat() {
        this.stan = new StanSpoczynku();
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }
    public void doAction(){
        stan.doAction(this);
    }
}
