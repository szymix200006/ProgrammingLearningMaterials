package wisniowa.tc.FirstGroup.Mediator;

public interface FlyingVehicle {
    void setMediator(Mediator m);

    void sentMessage(String msg);
    void receiveMessage(String msg);
}
