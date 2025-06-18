package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class MultipleOfaNumberBelow100Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if((number >= 0) && (number < 100)) {
			int counter = number - 1;
			while(counter >1) {
				if(number % counter==0) {
					System.out.println("The multiples are "+ counter);
					
				}
				counter --;
			}
		}else {
			System.out.println("the number is either a negative number or gretaer then 100");
		}

	}

}
