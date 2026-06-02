package design_patterns.Factory;

class NotificationFactory {

    public static Notification getNotification(
            String type) {

        if(type.equals("EMAIL"))
            return new EmailNotification();

        if(type.equals("SMS"))
            return new SmsNotification();

        return null;
    }
}
