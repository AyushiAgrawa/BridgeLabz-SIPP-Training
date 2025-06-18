package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class PrintOddAndEvenBetweenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number>=1) {
			for(int i=1;i<=number; i++ ) {
				if(i % 2 == 0) {
					System.out.println(i + " is even number");
				}else {
					System.out.println(i +" is odd number");
				}
			}
		}else {
			System.out.println("Not a natural number");
		}

	}

}
