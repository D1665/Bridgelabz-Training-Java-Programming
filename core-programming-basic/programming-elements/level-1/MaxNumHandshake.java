public class MaxNumHandshake {
    public static void main(String[] args) {
        int people = 5; // Number of people in the group
        int handshakes = (people * (people - 1)) / 2; // Using the formula n(n-1)/2
        System.out.println("The maximum number of handshakes that can occur among " + people + " people is: " + handshakes);
    }
}
