package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class whileLoopForSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number (0 or negative to stop): ");
        int sum =0;
        while (true) {
           
            int number = sc.nextInt();

            if (number <= 0) {
                break; 
            }

            sum += number; 
        }
        System.out.println("The total sum is: " + sum);
	}

}
