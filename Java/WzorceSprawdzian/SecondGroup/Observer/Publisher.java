package wisniowa.tc.SecondGroup.Observer;

public interface Publisher {
    void addSubscriber(SubscribingEntity subscriber);
    void removeSubscriber(SubscribingEntity subscriber);
    void notifySubscribers();
}
