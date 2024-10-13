package wisniowa.tc.FirstGroup.State;

public class ReceivedState implements PackageState {
    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void next(Package pkg) {
        System.out.println("This is final state");
    }

    @Override
    public void showStatus() {
        System.out.println("Status: package delivered");
    }
}
