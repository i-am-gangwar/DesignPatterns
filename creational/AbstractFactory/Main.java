package DesignPatterns.Creational.AbstractFactory;

import DesignPatterns.Creational.AbstractFactory.factory.FactoryProducer;
import DesignPatterns.Creational.AbstractFactory.factory.NotificationFactory;
import DesignPatterns.Creational.AbstractFactory.notification.Notification;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Get Android Notification Factory
        NotificationFactory androidFactory =  FactoryProducer.getFactory("Android");
        // Create and send Android SMS Notification
        Notification androidSms = androidFactory.createNotification("SMS");
        System.out.println(androidSms.sendNotification(" Hello from Android!")); 

        // Create and send Android Push Notification
        Notification androidPush = androidFactory.createNotification("PUSH");
        System.out.println(androidPush.sendNotification(" Hello from Android!"));


        // Get iOS Notification Factory
        NotificationFactory iosFactory = FactoryProducer.getFactory("IOS");

        // Create and send iOS Email Notification
        Notification iosEmail = iosFactory.createNotification("EMAIL");
        System.out.println(iosEmail.sendNotification(" Hello from IOS!"));

        // Create and send iOS SMS Notification
        Notification iosSms = iosFactory.createNotification("SMS");
        System.out.println(iosSms.sendNotification(" Hello from IOS!"));

    }
    
}
