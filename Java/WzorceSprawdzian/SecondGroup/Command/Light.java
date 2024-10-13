package wisniowa.tc.SecondGroup.Command;

public class Light {
    private boolean isOn = false;

    public void switchLight(){
        this.isOn = !this.isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
