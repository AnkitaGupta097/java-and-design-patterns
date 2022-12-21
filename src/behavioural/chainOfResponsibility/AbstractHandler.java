package behavioural.chainOfResponsibility;

public abstract class AbstractHandler {
    protected NotificationType messageType;

    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void sendNotification(NotificationType messageType, String message){
        if(this.messageType == messageType){
            sendMessage(message);
            return;
        }
        if(nextHandler !=null){
            System.out.println("Sending message to next handler");
            nextHandler.sendNotification(messageType, message);
        }
    }
    abstract void sendMessage(String message);
}
