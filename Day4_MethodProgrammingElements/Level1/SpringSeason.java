package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		if (isSpringSeason(month, day)) {
	            System.out.println("It's a Spring Season");
	     } else {
	            System.out.println("Not a Spring Season");
	     }
	}
	public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);
    }

}
