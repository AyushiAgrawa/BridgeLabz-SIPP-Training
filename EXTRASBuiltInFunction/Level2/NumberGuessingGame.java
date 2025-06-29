package EXTRASBuiltInFunction.Level2;
import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100 : ");
		int usernumber;
		int computernumber = generateGuess();
		do {
			 usernumber = sc.nextInt();
			if(usernumber > computernumber) {
				System.out.println("The number guessed by computer is low from the number given by you");
		    }else if(usernumber < computernumber) {
		    	System.out.println("The number guessed by computer is high from the number given by you ");
		    }else if(usernumber == computernumber ) {
		    	System.out.println("The computer guessed the number right");
		    }
		}while(usernumber != computernumber);
	}
	public static int generateGuess() {
        Random random = new Random();
        return random.nextInt(100 - 1) + 1;
    }
    

}
