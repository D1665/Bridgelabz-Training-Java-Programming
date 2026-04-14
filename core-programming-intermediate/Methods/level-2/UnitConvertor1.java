public class UnitConvertor1 {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    static double meterToFeet(double m) {
        return m * 3.28084;
    }

    static double feetToMeter(double f) {
        return f * 0.3048;
    }

    public static void main(String[] args) {

        System.out.println(kmToMiles(10));
        System.out.println(milesToKm(10));
        System.out.println(meterToFeet(10));
        System.out.println(feetToMeter(10));
    }
}