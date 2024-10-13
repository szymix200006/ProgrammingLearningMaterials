package wisniowa.tc.SecondGroup.bridge2;

public interface Device {
    void power();
    int getChannel();
    void setChannel(int channel);
    int getVolume();
    void setVolume(int volume);
    void print();
}
