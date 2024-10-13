package wisniowa.tc.SecondGroup.Observer;

public class SubscribingEntity implements Subscriber {
    int id;

    public SubscribingEntity(int id) {
        this.id = id;
    }

    @Override
    public void update(int value, int publisherId) {
        System.out.println("SUBSCRIBER "+this.id+": received updated value "+value+" from publisher "+publisherId);
    }

    public int getId() {
        return id;
    }
}
