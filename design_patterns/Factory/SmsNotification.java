package design_patterns.Factory;

class SmsNotification
implements Notification {

    public void send() {
        System.out.println("SMS Sent");
    }
}
