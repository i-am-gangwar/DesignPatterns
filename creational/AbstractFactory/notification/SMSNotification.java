package Creational.AbstractFactory.notification;

public class SMSNotification implements Notification{

    @Override
    public String sendNotification(String message) {
        return "Sending SMS Notification"+message;
    }
    
}
