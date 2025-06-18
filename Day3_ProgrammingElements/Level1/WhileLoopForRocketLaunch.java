package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class WhileLoopForRocketLaunch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting value for the countdown: ");
		int counter= sc.nextInt();
		while(counter >= 1) {
			System.out.println(counter);
			counter--;
		}
		

	}

}
