package wisniowa.tc.FirstGroup.Fasada;

public class SugarDeliver {
    private static SugarDeliver sugarDeliver = null;
    private int sugar = 100;

    public int getSugarInMagazine() {
        return sugar;
    }

    public void setSugarInMagazine(int sugarInMagazine) {
        this.sugar = sugarInMagazine;
    }

    public static SugarDeliver getInstance(){
        if(sugarDeliver!=null){

            return sugarDeliver;
        } else {
            sugarDeliver = new SugarDeliver();
            return sugarDeliver;
        }
    }
}
