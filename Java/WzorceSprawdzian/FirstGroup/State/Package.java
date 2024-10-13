package wisniowa.tc.FirstGroup.State;

public class Package {
    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    private PackageState state = new OrderedState();

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void showDetails(){
        state.showStatus();
    }
}
