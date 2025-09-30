package Creational.AbstractFactory.notification;

public class PushNotification implements Notification{

    @Override
    public String sendNotification(String message) {
        return "Sending Push Notification"+message;
    }
    
}
