public class EmailNotificationFactory extends AbstractNotificationFactory {
    @Override
    protected Notification factoryMethod() {
        return new EmailNotification();
    }
}
