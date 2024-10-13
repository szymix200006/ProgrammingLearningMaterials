package wisniowa.tc.FirstGroup.Mediator;

public interface Mediator {
    void addVehicle(FlyingVehicle f);
    void sentMessage(String msg, FlyingVehicle lyingVehicle);
    void receiveMessage(String msg, FlyingVehicle lyingVehicle);
}
