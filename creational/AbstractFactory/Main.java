package Creational.AbstractFactory;

import Creational.AbstractFactory.factory.FactoryProducer;
import Creational.AbstractFactory.factory.NotificationFactory;
import Creational.AbstractFactory.notification.Notification;

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
