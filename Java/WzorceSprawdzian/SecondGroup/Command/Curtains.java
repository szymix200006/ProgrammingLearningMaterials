package wisniowa.tc.SecondGroup.Command;

public class Curtains {
    private boolean isOpen = false;
    public void openClose(){
        this.isOpen = !this.isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
