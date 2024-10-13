package wisniowa.tc.FirstGroup.State;

public class OrderedState implements PackageState {
    @Override
    public void prev(Package pkg) {
        System.out.println("There is no prev state");
    }

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void showStatus() {
        System.out.println("Status: package ordered");
    }
}
