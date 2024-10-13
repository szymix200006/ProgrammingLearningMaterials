package wisniowa.tc.FirstGroup.Bridge;

public class TV implements Device{
    private boolean on;

    public boolean isOn() {
        return on;
    }


    private int volume;
    private int channel;
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void handleChangeOn(boolean on) {
        this.on = on;
    }
}
