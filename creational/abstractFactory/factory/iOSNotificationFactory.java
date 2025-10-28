package creational.abstractFactory.factory;
import creational.abstractFactory.notification.EmailNotification;
import creational.abstractFactory.notification.Notification;
import creational.abstractFactory.notification.PushNotification;
import creational.abstractFactory.notification.SMSNotification;



public class iOSNotificationFactory implements NotificationFactory {
    
    @Override
    public Notification createNotification(String type) {

        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        return null;  // Return null if type is not found
    }
    
}
