package wisniowa.tc.FirstGroup.Bridge;

public interface Device {
    public void setVolume(int volume);
    public void setChannel(int channel);
    public int getVolume();
    public int getChannel();
    public void handleChangeOn(boolean on);
}
