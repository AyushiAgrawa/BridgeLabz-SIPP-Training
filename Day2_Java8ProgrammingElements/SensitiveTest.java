package JavaFeature.Day2_Java8ProgrammingElements;
interface SensitiveData {}

class UserInfo implements SensitiveData {
    String ssn;
    UserInfo(String ssn) { this.ssn = ssn; }
}

public class SensitiveTest {
    public static void main(String[] args) {
        UserInfo user = new UserInfo("123-45-6789");
        if(user instanceof SensitiveData) System.out.println("This data is sensitive and needs encryption");
    }
}
