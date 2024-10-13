package wisniowa.tc.SecondGroup.Command;

public class LightsCommand implements Command{
    Light light;

    public LightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchLight();
    }
}
