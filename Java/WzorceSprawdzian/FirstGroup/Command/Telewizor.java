package wisniowa.tc.FirstGroup.Command;

public class Telewizor implements Urzadzenie{

    @Override
    public void wlacz(){
        System.out.println("Wlaczono telewizor");
    }
    @Override
    public void wylacz(){
        System.out.println("Wylaczono telewizor");
    }
    public void zmienKanal(){
        System.out.println("Zmieniono kanal");
    }

}
