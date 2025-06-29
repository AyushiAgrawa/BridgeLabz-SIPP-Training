package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class FizzBuzzProgramForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n>=0) {
			while(n>=0) {
				if((n %3 == 0) && (n%5==0)) {
				    System.out.println("FizzBuzz");
				    break;
			    }else if(n % 5 == 0) {
				    System.out.println("Buzz");
				    break;
			    }else if(n %3 == 0) {
				    System.out.println("Fizz");
				    break;
			    }else {
				    System.out.println("Not a multiple of 3 or 5");
				    break;
			    }
		     }
		 }else {
			 System.out.println("Not a positive number");
		 }
	}

}
