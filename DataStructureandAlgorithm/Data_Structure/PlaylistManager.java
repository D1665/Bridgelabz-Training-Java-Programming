package DataStructureandAlgorithm.Data_Structure;

public class PlaylistManager {
    static class Song {
        String title;
        Song next;
        Song(String t) { title = t; next = null; }
    }

    Song head;

    void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            newSong.next = head;
            return;
        }
        Song temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newSong;
        newSong.next = head;
    }

    void removeSong(String title) {
        if (head == null) return;
        if (head.title.equals(title) && head.next == head) { head = null; return; }
        Song temp = head;
        while (!temp.next.title.equals(title) && temp.next != head) temp = temp.next;
        if (temp.next.title.equals(title)) temp.next = temp.next.next;
        if (head.title.equals(title)) head = temp.next;
    }

    void playAll() {
        if (head == null) { System.out.println("Playlist empty!"); return; }
        Song temp = head;
        System.out.println("Playing playlist:");
        do {
            System.out.println("  Now playing: " + temp.title);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        PlaylistManager pm = new PlaylistManager();
        pm.addSong("Song A");
        pm.addSong("Song B");
        pm.addSong("Song C");
        pm.playAll();
        pm.removeSong("Song B");
        System.out.println("After removing Song B:");
        pm.playAll();
    }
}
