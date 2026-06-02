package design_principle.DIP;



public class SMSNotification
        implements Notification {

    @Override
    public void send() {

        System.out.println(
                "SMS Sent");
    }
}