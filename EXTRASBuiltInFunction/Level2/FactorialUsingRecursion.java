package EXTRASBuiltInFunction.Level2;
import java.util.*;
class FactorialUsingRecursion {
    public static int getinput() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	int n = sc.nextInt();
    	return n;
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }
	public static void main(String[] args) {
		 int number = getinput();

	        if (number < 0) {
	            System.out.println(" negative number ");
	        } else {
	            long result = factorial(number);
	            displayResult(number, result);
	        }
	}

}
