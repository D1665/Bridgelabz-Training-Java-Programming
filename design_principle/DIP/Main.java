package design_principle.DIP;

public class Main {

    public static void main(String[] args) {

        //EmailNotification en = new EmailNotification(); --Tight coupling 
        //en.send();

        Notification notification =      //loose coupling
                new EmailNotification();

        notification.send();
    }
}