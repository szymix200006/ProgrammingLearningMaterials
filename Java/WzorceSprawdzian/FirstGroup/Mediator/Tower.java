package wisniowa.tc.FirstGroup.Mediator;

import java.util.ArrayList;

public class Tower implements Mediator {
    private ArrayList<FlyingVehicle> vehicles = new ArrayList<>();

    public void addVehicle(FlyingVehicle vehicle) {
        vehicles.add(vehicle);
    }
    void removeVehicles() {
        vehicles = new ArrayList<>();
    }

    @Override
    public void sentMessage(String msg, FlyingVehicle requestSender) {
        if (msg.equals("landing request")) {
            if (vehicles.size() == 1) {
                requestSender.receiveMessage("you can landing on 1 gate");
            } else if(requestSender == vehicles.get(1)) {
                requestSender.receiveMessage("you can landing on 1 gate");
                vehicles.get(0).receiveMessage("you can landing on 2 gate");
            } else {
                requestSender.receiveMessage("good bye, bro. We have not free gates");
            }
        }
    }
    @Override
    public void receiveMessage(String msg, FlyingVehicle lyingVehicle) {

    }
}
