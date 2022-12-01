package creational.factory;

public class SMSNotification implements  Notification{

    @Override
    public void notifyUser(String msg) {
        System.out.println("SMS Notification "+msg);
    }
}
