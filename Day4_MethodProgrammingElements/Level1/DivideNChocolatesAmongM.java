package Day4_MethodProgrammingElements.Level1;
import java.util.Scanner;
public class DivideNChocolatesAmongM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of chocolates: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of children: ");
		int m = sc.nextInt();
		 if (n == 0) {
	            System.out.println("Cannot divide chocolates among zero children!");
	        } else {
	            int[] result = findRemainderAndQuotient(n, m);
	            System.out.println("Each child gets: " + result[0] + " chocolates");
	            System.out.println("Remaining chocolates: " + result[1]);
	        }
       
	}
	
	 public static int[] findRemainderAndQuotient(int n, int m) {
	        int[] result = new int[2];  
	        result[0] = n / m;
	        result[1] = n % m;
	        return result;
	    }
	
}
