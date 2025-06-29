package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class NumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();	
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));

	}
	public static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= n / 2; i++)
	            if (n % i == 0)
	                return false;
	        return true;
	}
	public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
	public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
	public static boolean isAutomorphic(int n) {
        int square = n * n;
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
	public static boolean isBuzz(int n) {
	    return n % 7 == 0 || n % 10 == 7;
	}


}
