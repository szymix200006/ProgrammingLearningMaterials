package wisniowa.tc.SecondGroup.bridge2;

public class StandardRemote implements Remote{
    protected Device device;

    public StandardRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        device.power();
    }

    @Override
    public void changeChannel(int newChannel) {
        device.setChannel(newChannel);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}
