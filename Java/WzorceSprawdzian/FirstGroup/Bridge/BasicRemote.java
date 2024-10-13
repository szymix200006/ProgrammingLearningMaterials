package wisniowa.tc.FirstGroup.Bridge;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void goDownVolume(int volume) {
        this.device.setVolume(device.getVolume()-volume);
    }

    @Override
    public void goUpVolume(int volume) {
        this.device.setVolume(device.getVolume()+volume);

    }

    @Override
    public void goUpChannel(int channel) {
        this.device.setChannel(device.getChannel()+channel);
    }

    @Override
    public void goDownChannel(int channel) {

        this.device.setChannel(device.getChannel()-channel);
    }

    @Override
    public void restart() {
        this.device.handleChangeOn(false);
        this.device.handleChangeOn(true);
    }


}
