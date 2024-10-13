package wisniowa.tc.SecondGroup.Fasada;

public class DeliveryBoxFacade {
    private static DeliveryBox deliveryBox;
    private static DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        deliveryBox = new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }
        public static void pickUpPacage () {
            deliveryBox.zbierzInformacjeUzytkownika();
            if (deliveryBoxSystem.rozpoznanieUzytkownika() && deliveryBoxSystem.czyPlatnoscZostalaDokonana()) {
                deliveryBox.otworzPudlo();
            }

        }

}
