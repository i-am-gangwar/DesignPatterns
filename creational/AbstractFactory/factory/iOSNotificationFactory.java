package DesignPatterns.Creational.AbstractFactory.factory;
import DesignPatterns.Creational.AbstractFactory.notification.EmailNotification;
import DesignPatterns.Creational.AbstractFactory.notification.Notification;
import DesignPatterns.Creational.AbstractFactory.notification.PushNotification;
import DesignPatterns.Creational.AbstractFactory.notification.SMSNotification;



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
