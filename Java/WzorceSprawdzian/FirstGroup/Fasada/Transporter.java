package wisniowa.tc.FirstGroup.Fasada;

public class Transporter {
    private static Transporter transporterInstance = null;
    private int petrol = 20;

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public static Transporter getInstance(){
        if(transporterInstance!=null){

            return transporterInstance;
        } else {
            transporterInstance = new Transporter();
            return transporterInstance;
        }
    }
}
