public class PushNotificationFactory extends AbstractNotificationFactory {

    @Override
    protected Notification factoryMethod() {
        return new PushNotification();
    }

}
