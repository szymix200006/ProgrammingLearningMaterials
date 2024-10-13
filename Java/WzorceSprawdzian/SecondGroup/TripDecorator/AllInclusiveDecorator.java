package wisniowa.tc.SecondGroup.TripDecorator;

public class AllInclusiveDecorator extends TripDecorator {
    public AllInclusiveDecorator(ITrip tr) {
        super(tr);
    }
    @Override
    public void showInfo() {
        item.showInfo();
        System.out.println("jedzenie");
    }
}