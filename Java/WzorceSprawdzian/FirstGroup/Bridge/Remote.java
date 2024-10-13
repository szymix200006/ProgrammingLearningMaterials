package wisniowa.tc.FirstGroup.Bridge;

public interface Remote {
    public void goDownVolume(int volume);
    public void goUpVolume(int volume);
    public void goUpChannel(int channel);
    public void goDownChannel(int channel);
    public void restart();
}
