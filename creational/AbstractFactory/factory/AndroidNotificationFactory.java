package Creational.AbstractFactory.factory;
import Creational.AbstractFactory.notification.EmailNotification;
import Creational.AbstractFactory.notification.Notification;
import Creational.AbstractFactory.notification.PushNotification;
import Creational.AbstractFactory.notification.SMSNotification;



public class AndroidNotificationFactory implements NotificationFactory {
    
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
