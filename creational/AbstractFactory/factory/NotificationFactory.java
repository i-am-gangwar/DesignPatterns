package Creational.AbstractFactory.factory;

import Creational.AbstractFactory.notification.Notification;

public interface NotificationFactory {
    public Notification createNotification(String notificationType);
}
