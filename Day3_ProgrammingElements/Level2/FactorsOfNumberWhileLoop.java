package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class FactorsOfNumberWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number>0) {
			int counter = 1  ;
			while(counter < number) {
				if(number % counter == 0) {
					System.out.println("The factors are " + counter);
				}
				counter ++;
			}
		}else {
			System.out.println("Not a positive number");
		}

	}

}
