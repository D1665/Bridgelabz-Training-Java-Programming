package design_principle.DIP;

public class EmailNotification
        implements Notification {

    @Override
    public void send() {

        System.out.println(
                "Email Sent");
    }
}
