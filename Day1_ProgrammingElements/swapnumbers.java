import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();
		int swapped = number1;
		number1 = number2 ;
		number2 = swapped;
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
		

	}

}
