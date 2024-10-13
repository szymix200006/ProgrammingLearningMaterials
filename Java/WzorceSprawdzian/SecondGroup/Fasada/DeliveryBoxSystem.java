package wisniowa.tc.SecondGroup.Fasada;

public class DeliveryBoxSystem {
    public boolean rozpoznanieUzytkownika(){
        System.out.println("Uzytkownik został rozpoznany");
        return true;
    }
    public boolean czyPlatnoscZostalaDokonana(){
        System.out.println("Platnosc zostala dokonana");
        return true;
    }
    public void wyslijWiadomosc(){
        System.out.println("Wiadomosc zostala wyslana");
    }
    public void kalendarzInPost(){
        System.out.println("Wysyłka została zaplanowana");
    }
}
