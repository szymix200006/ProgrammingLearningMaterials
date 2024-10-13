package wisniowa.tc.SecondGroup.Fasada;

public class DeliveryBox {
    public boolean czyPudloJestPelne(){
        System.out.println("Pudło nie jest pełne");
        return false;
    }
    public boolean czyJestPudelkoZepsote(){
        System.out.println("Pudelko nie jest zepsote");
        return false;
    }
    public void zbierzInformacjeUzytkownika(){
        System.out.println("Informacje zostały pobrane");
    }
    public void otworzPudlo(){
        System.out.println("Pudlo zostało otwarte");
    }
}
