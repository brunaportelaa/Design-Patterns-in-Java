public class SMSNotificationFactory extends AbstractNotificationFactory {
    @Override
    protected Notification factoryMethod() {
        return new SMSNotification() ;
    }
}
