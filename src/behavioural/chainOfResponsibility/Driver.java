package behavioural.chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {
        NotificationHandlerChain handlerChain = new NotificationHandlerChain();
        // Send SMS Notification
        handlerChain.sendNotification(NotificationType.SMS, "Hello");
        // Send Email Notification
        handlerChain.sendNotification(NotificationType.EMAIL, "Hello");
    }
}
