package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class CheckNumberEvenOddCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		  System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = sc.nextInt();
	        }
	        for (int i = 0; i < numbers.length; i++) {
	            int num = numbers[i];
	            if (isPositive(num)) {
	                System.out.print("Number " + num + " is Positive and ");
	                if (isEven(num)) {
	                    System.out.println("Even.");
	                } else {
	                    System.out.println("Odd.");
	                }
	            } else {
	                System.out.println("Number " + num + " is Negative.");
	            }
	        }
	        
	        int result = compare(numbers[0], numbers[4]);
	        System.out.print("Comparison between first (" + numbers[0] + ") and last (" + numbers[4] + ") element: ");
	        if (result == 1) {
	            System.out.println("First number is greater.");
	        } else if (result == 0) {
	            System.out.println("Both numbers are equal.");
	        } else {
	            System.out.println("First number is smaller.");
	        }
		
	}
	public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
	

}
