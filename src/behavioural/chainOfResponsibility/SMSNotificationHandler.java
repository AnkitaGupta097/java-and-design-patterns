package behavioural.chainOfResponsibility;

public class SMSNotificationHandler extends AbstractHandler {

    public SMSNotificationHandler(NotificationType messageType) {
        this.messageType = messageType;
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("Sending message via SMS: " + message);
    }
}
