package wisniowa.tc.SecondGroup.TripDecorator;

public class UltraDecorator extends TripDecorator {
    public UltraDecorator(ITrip tr) {
        super(tr);
    }
    @Override
    public void showInfo() {
        item.showInfo();
        System.out.println("Wodka");
    }
}