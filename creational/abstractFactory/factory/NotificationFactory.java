package creational.abstractFactory.factory;

import creational.abstractFactory.notification.Notification;

public interface NotificationFactory {
    public Notification createNotification(String notificationType);
}
