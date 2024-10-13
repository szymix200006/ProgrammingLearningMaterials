package wisniowa.tc.SecondGroup.Kompozyt;

public class Pastuch implements Niewolnik{

    private int id;

    public Pastuch(int id) {
        this.id = id;
    }

    @Override
    public void showDetails() {
        System.out.println("jestem pastuchem moje id: " + this.id);
    }
}
