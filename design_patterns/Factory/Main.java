package design_patterns.Factory;

public class Main {
    public static void main(String[] args) {
        Notification notification =
NotificationFactory.getNotification("SMS");

notification.send();
    }
}
