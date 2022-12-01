package creational.factory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(String msg) {
         System.out.println("Push Notification "+msg);
    }
}
