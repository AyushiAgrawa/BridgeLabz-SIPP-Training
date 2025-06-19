package Day4_MethodProgrammingElements.Level2;

public class GenerateSixOTPNumber {

	public static void main(String[] args) {
		int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = OTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        boolean isUnique = OTPUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + isUnique);
	}
    public static int OTP() {
    	return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean OTPUnique(int[] otp) {
        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
