package wisniowa.tc.FirstGroup.Fasada;


public class Drink {


    private String brand;

    public Drink(String brand, boolean deliver, int sugarLevel) {
        this.brand = brand;
        this.deliver = deliver;
        this.sugarLevel = sugarLevel;
    }

    private boolean deliver;
    private int sugarLevel;


}
