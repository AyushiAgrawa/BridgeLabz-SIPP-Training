package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		 if (year < 1582) {
	            System.out.println("Year should be 1582 or later (Gregorian calendar).");
	        } else if (checkLeap(year)) {
	            System.out.println(year + " is a Leap Year.");
	        } else {
	            System.out.println(year + " is Not a Leap Year.");
	        }
	}
    public static boolean checkLeap(int year) {
    	 return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
