package wisniowa.tc.FirstGroup.Strategy;

public class CarStrategy implements Strategy {
    @Override
    public float road(float a){
        return a/60;
    }
}
