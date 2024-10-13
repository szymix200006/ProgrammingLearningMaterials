package wisniowa.tc.FirstGroup.Command;

public class ZmienKanal implements Polecenie{
    private Telewizor tv;

    public ZmienKanal(Telewizor tv){
        this.tv = tv;
    }

    public void wykonaj(){
        tv.zmienKanal();
    }

}
