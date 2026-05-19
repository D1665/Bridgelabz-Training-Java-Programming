package DataStructureandAlgorithm.project;

import java.util.Stack;

public class StationHistory {

    Stack<String> stationStack = new Stack<>();

    // Add Station
    public void addStation(String station) {
        stationStack.push(station);
        System.out.println("Station added.");
    }

    // Undo Last Station
    public void undoStation() {

        if (stationStack.isEmpty()) {
            System.out.println("No station history available.");
            return;
        }

        System.out.println("Removed Station: " + stationStack.pop());
    }

    // Display History
    public void displayHistory() {
        System.out.println(stationStack);
    }
}