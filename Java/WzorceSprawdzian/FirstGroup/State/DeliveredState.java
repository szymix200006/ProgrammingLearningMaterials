package wisniowa.tc.FirstGroup.State;

public class DeliveredState implements PackageState {
    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void showStatus() {
        System.out.println("Status: package delivered to parcel locker");
    }
}
