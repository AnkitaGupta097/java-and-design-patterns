package creational.factory;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser("Hello");

        Notification emailNotification = NotificationFactory.createNotification(NotificationType.EMAIL);
        emailNotification.notifyUser("Hello");
    }
}
