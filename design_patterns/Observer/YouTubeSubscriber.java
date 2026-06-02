package design_patterns.Observer;

public class YouTubeSubscriber
        implements Subscriber {

    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {

        System.out.println(
                "🔔 " + name +
                " received notification: " +
                videoTitle);
    }
}