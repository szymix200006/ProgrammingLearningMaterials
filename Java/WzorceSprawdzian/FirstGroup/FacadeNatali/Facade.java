package wisniowa.tc.FirstGroup.FacadeNatali;


public class Facade {
    Translator translator;
    PeriodPutter periodPutter;

    public Facade() {
        translator = new Translator();
        periodPutter = new PeriodPutter();
    }
    public String translateAndPutDot(String text){
        return periodPutter.putADot(translator.translate(text));
    }
}
