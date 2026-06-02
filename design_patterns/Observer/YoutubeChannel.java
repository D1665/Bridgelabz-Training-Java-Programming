package design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel
        implements Channel {

    private List<Subscriber>
            subscribers =
            new ArrayList<>();

    private String latestVideo;

    @Override
    public void subscribe(
            Subscriber subscriber) {

        subscribers.add(subscriber);

        System.out.println(
                "✅ Subscriber Added");
    }

    @Override
    public void unsubscribe(
            Subscriber subscriber) {

        subscribers.remove(subscriber);

        System.out.println(
                "❌ Subscriber Removed");
    }

    @Override
    public void notifySubscribers() {

        for (Subscriber subscriber
                : subscribers) {

            subscriber.update(
                    latestVideo);
        }
    }

    public void uploadVideo(
            String videoTitle) {

        latestVideo = videoTitle;

        System.out.println(
                "\n📹 New Video Uploaded: "
                        + videoTitle);

        notifySubscribers();
    }
}