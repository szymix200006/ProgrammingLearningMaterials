package wisniowa.tc.SecondGroup.MetodaSzablonowa;

public abstract class MealPrep {
    public final void przygotuj(){
        skladniki();
        ugotowanie();
        serwowanie();
    }
    abstract void skladniki();
    abstract void ugotowanie();
    abstract void serwowanie();

}
