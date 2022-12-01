package creational.factory;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type){

            switch (type.toString()) {
                case "SMS":
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                case "PUSH":
                    return new PushNotification();

            }
        return null;
    }

}
