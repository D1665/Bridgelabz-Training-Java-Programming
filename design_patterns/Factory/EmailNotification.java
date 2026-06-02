package design_patterns.Factory;

class EmailNotification
implements Notification {

    public void send() {
        System.out.println("Email Sent");
    }
}