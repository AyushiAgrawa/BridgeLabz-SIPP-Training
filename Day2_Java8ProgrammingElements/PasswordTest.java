package JavaFeature.Day2_Java8ProgrammingElements;
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        String pwd = "Secure123";
        System.out.println("Is strong? " + SecurityUtils.isStrongPassword(pwd));
    }
}
