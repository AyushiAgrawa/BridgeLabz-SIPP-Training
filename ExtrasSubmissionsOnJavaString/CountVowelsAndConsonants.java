package ExtrasSubmissionsOnJavaString;
import java.util.*;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        VowelsAndConsonants(s);
    }

    public static void VowelsAndConsonants(String s) {
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (vowels.indexOf(ch) != -1) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        System.out.println("Number of vowels: " + count1);
        System.out.println("Number of consonants: " + count2);
    }
}
