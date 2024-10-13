package wisniowa.tc.FirstGroup.Strategy;

public class BikeStrategy implements Strategy {
    @Override
    public float road(float a){
        return a/12;
    }

}
