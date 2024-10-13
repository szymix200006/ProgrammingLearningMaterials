package wisniowa.tc.SecondGroup.TripDecorator;

public class TripDecorator implements ITrip {
    ITrip item;

    public TripDecorator(ITrip item) {
        this.item = item;
    }

    @Override
    public void showInfo() {
        item.showInfo();
    }
}
