package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		if(((month > 3 && month < 6 ) && day>= 20) || ((month >3 && month < 6 && day<= 20))) {
			System.out.println("It's a Spring Season");
		}else {
			System.out.println("Not a Sring Season");
		}

	}

}
