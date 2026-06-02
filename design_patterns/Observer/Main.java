package design_patterns.Observer;

public class Main {

    public static void main(String[] args) {

        // Create Channel

        YoutubeChannel channel =
                new YoutubeChannel();

        // Create Subscribers

        Subscriber rahul =
                new YouTubeSubscriber(
                        "Rahul");

        Subscriber amit =
                new YouTubeSubscriber(
                        "Amit");

        Subscriber priya =
                new YouTubeSubscriber(
                        "Priya");

        // Subscribe

        channel.subscribe(rahul);

        channel.subscribe(amit);

        channel.subscribe(priya);

        // Upload Video

        channel.uploadVideo(
                "Observer Design Pattern Tutorial");

        // Unsubscribe One User

        channel.unsubscribe(amit);

        // Upload Another Video

        channel.uploadVideo(
                "Decorator Design Pattern Tutorial");
    }
}