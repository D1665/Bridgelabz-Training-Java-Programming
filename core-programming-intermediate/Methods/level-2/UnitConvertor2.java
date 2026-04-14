public class UnitConvertor2 {

    static double yardsToFeet(double y) {
        return y * 3;
    }

    static double feetToYards(double f) {
        return f * 0.333333;
    }

    static double meterToInches(double m) {
        return m * 39.3701;
    }

    static double inchesToMeter(double i) {
        return i * 0.0254;
    }

    static double inchesToCm(double i) {
        return i * 2.54;
    }

    public static void main(String[] args) {

        System.out.println(yardsToFeet(5));
        System.out.println(feetToYards(9));
        System.out.println(meterToInches(2));
        System.out.println(inchesToMeter(10));
        System.out.println(inchesToCm(10));
    }
}