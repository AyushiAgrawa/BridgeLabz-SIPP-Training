package EXTRASBuiltInFunction.Level2;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean checkprime(int n) {
    	 if (n <= 1) {
             return false;
         }
    	 
    	 for (int i = 2; i < n; i++) {
             if (n % i == 0) {
                return false;
                
             }
         }  
    	 return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if (checkprime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
          System.out.println(n+ " is not a Prime Number.");
        } 
	}
   
}
	
