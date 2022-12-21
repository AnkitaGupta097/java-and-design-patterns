package behavioural.chainOfResponsibility;

public class EmailNotificationHandler extends AbstractHandler {

    public EmailNotificationHandler(NotificationType messageType) {
        this.messageType = messageType;
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("Sending message via Email: " + message);
    }
}