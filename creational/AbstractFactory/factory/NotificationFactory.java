package DesignPatterns.Creational.AbstractFactory.factory;

import DesignPatterns.Creational.AbstractFactory.notification.Notification;

public interface NotificationFactory {
    public Notification createNotification(String notificationType);
}
