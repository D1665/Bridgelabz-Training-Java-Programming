package design_principle.Library_Management_System.Notification;



public class EmailNotificationService
        implements NotificationService {

    @Override
    public void send(String message) {

        System.out.println(
                "[EMAIL] " + message
        );
    }
}