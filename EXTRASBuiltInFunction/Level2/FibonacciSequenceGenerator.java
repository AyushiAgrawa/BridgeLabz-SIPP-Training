package EXTRASBuiltInFunction.Level2;
import java.util.*;
public class FibonacciSequenceGenerator {
	public static void printFibonacci(int n) {
		int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(n);
        }
	}

}
