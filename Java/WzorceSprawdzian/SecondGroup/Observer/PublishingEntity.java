package wisniowa.tc.SecondGroup.Observer;

import java.awt.*;
import java.util.ArrayList;

public class PublishingEntity implements Publisher{
    private int id;
    private int state;
    private ArrayList<SubscribingEntity> subscribers = new ArrayList<>();

    public PublishingEntity(int id) {
        this.id = id;
    }

    public void setState(int state) {
        this.state = state;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(SubscribingEntity subscriber) {
        subscribers.add(subscriber);
        System.out.println("Publisher "+this.id+ " registered subscription from " + subscriber.getId() );
    }

    @Override
    public void removeSubscriber(SubscribingEntity subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Publisher "+this.id+ " registered subscription cancellation from " + subscriber.getId() );
    }

    @Override
    public void notifySubscribers() {
        for(SubscribingEntity subscriber : subscribers) {
            subscriber.update(state, id);
        }
    }
}
