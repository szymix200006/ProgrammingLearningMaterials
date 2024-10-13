package wisniowa.tc.FirstGroup.Mediator;

public class Helicopter implements FlyingVehicle {
    Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sentMessage(String msg) {
        System.out.println("Helikopter wysyla komunikat " + msg);
        mediator.sentMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Helikopter dostaje komunikat: " + msg);
    }
}
