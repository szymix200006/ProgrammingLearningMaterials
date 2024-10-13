package wisniowa.tc.SecondGroup.Kompozyt;

import java.util.ArrayList;

public class Menadzer implements Niewolnik{

    private String name;

    private ArrayList<Niewolnik> niewolnicy = new ArrayList<>();

    public Menadzer(String name) {
        this.name = name;
    }
    public void add(Niewolnik n){
        niewolnicy.add(n);
    }

    public void remove(Niewolnik n){
        niewolnicy.remove(n);
    }
    @Override
    public void showDetails() {
        System.out.println("Jestem zarzadca o imieniu " + this.name +"moi niewolnicy: ");
        for (Niewolnik n: niewolnicy) {
            n.showDetails();
        }
    }
}
