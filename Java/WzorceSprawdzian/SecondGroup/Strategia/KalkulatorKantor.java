package wisniowa.tc.SecondGroup.Strategia;

public class KalkulatorKantor {
    private Kalkulator kalkulator;
    public void setDzialanie(Kalkulator kalkulator){
        this.kalkulator = kalkulator;
    }
    public int executeDzialanie(int a, int b){
        return kalkulator.wynik(a,b);
    }
}
