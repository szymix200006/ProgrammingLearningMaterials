package wisniowa.tc.SecondGroup.bridge2;

public class Tv implements Device{
    private int channel = 1;
    private int volume = 20;
    private boolean power = false;

    @Override
    public void power() {
        power = !power;
    }

    @Override
    public int getChannel() {
        return channel;
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
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void print() {
        System.out.println("------------------");
        System.out.println("Tv");
        System.out.println("channel=" + channel);
        System.out.println("volume=" + volume);
        System.out.println("power=" + power);
        System.out.println("------------------");
    }

}
