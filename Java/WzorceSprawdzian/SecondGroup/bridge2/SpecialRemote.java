package wisniowa.tc.SecondGroup.bridge2;

public class SpecialRemote extends StandardRemote{

    public SpecialRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
