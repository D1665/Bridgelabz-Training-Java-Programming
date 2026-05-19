package DataStructureandAlgorithm.project;

import java.util.HashMap;

public class TravelAnalytics {

    HashMap<String, Integer> stationCount = new HashMap<>();

    // Add Travel Data
    public void addStationVisit(String station) {

        if (stationCount.containsKey(station)) {
            stationCount.put(station, stationCount.get(station) + 1);
        } else {
            stationCount.put(station, 1);
        }
    }

    // Display Data
    public void displayAnalytics() {

        for (String station : stationCount.keySet()) {
            System.out.println(station + " -> " + stationCount.get(station));
        }
    }

    // Search Frequency
    public void searchStation(String station) {

        if (stationCount.containsKey(station)) {
            System.out.println("Passengers at " + station + ": "
                    + stationCount.get(station));
        } else {
            System.out.println("Station not found.");
        }
    }
}