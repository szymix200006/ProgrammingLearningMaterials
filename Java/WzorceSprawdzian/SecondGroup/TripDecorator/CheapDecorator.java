package wisniowa.tc.SecondGroup.TripDecorator;

public class CheapDecorator extends TripDecorator {
    public CheapDecorator(Trip tr) {
        super(tr);
    }
    @Override
    public void showInfo() {
        item.showInfo();
        System.out.println("dodaj lot");
    }
}
