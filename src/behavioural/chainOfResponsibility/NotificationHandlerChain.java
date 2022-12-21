package behavioural.chainOfResponsibility;

public class NotificationHandlerChain {

    private AbstractHandler handlerChain;

    public NotificationHandlerChain() {
        AbstractHandler smsHandler = new SMSNotificationHandler(NotificationType.SMS);
        AbstractHandler  emailHandler = new EmailNotificationHandler(NotificationType.EMAIL);
        // Create handler chain SMS -> EMAIL
        smsHandler.setNextHandler(emailHandler);
        // Set handler chain
        handlerChain = smsHandler;
    }
    public void sendNotification(NotificationType messageType, String message) {
        handlerChain.sendNotification(messageType, message);
    }
}
