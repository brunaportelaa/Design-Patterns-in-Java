public abstract class AbstractNotificationFactory {

    protected abstract Notification factoryMethod();

    public Notification getNotification() {
        return factoryMethod();
    }
}
