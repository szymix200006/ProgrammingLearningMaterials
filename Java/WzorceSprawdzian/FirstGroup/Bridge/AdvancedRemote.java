package wisniowa.tc.FirstGroup.Bridge;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        device.setVolume(0);
    }
}
