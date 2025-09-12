package DesignPatterns.Creational.AbstractFactory.notification;

public class EmailNotification implements Notification{

    @Override
    public String sendNotification(String message){
        return "Sending Email Notification"+message;
    }
    
}
