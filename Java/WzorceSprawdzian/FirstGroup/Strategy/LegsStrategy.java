package wisniowa.tc.FirstGroup.Strategy;

public class LegsStrategy implements Strategy {
    @Override
    public float road(float a){
        return a/6;
    }

}
