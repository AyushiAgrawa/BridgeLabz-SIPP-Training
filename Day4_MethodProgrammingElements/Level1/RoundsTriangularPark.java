package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class RoundsTriangularPark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side : ");
		int a = sc.nextInt();
		System.out.println("Enter second side :  ");
		int b = sc.nextInt();
		System.out.println("Enter third side : ");
		int c = sc.nextInt();
		
		int rounds = Perimeter(a, b, c);
		System.out.println("The number of rounds the user needs to do complete a 5km run: "+ rounds);	
		
	}
    public static int Perimeter(int a, int b, int c) {
    	int perimeter = a + b + c;
    	int distance = 5;
    	return distance / perimeter ;
    }
}
