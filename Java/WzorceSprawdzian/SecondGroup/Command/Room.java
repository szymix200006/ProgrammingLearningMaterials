package wisniowa.tc.SecondGroup.Command;

public class Room extends Component{
    private Curtains curtains;
    private Light light;

    public Room() {
        this.curtains = new Curtains();
        this.light = new Light();
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public Light getLight() {
        return light;
    }

    public boolean curtainsOpen(){
        return curtains.isOpen();
    }

    public boolean LightOn(){
        return light.isOn();
    }
}
