public class OTP {

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static void main(String[] args) {

        int otp = generateOTP();

        System.out.println("OTP = " + otp);
    }
}