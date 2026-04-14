import java.util.*;
public class VolumeOfEarthInKMandMiles {
    public static void main(String[] args) {
        double radiusInKm = 6371.0; // Average radius of Earth in kilometers
        double radiusInMiles = radiusInKm * 0.621371; // Convert radius to miles

        // Volume of a sphere formula: V = (4/3) * π * r^3
        double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
        double volumeInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

        System.out.println("Volume of Earth in cubic kilometers: " + volumeInKm);
        System.out.println("Volume of Earth in cubic miles: " + volumeInMiles);
    }
}
