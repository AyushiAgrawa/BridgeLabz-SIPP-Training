package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		double Principal = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double Rate = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		
		double result = simpleinterest(Principal, Rate, time);
		 System.out.println("The Simple Interest is " + result +" for Principal " + Principal +", Rate of Interest " + Rate + " and Time " + time);
	}
	public static double simpleinterest(double Principal, double Rate, double time) {
		return (Principal * Rate * time)/100;
		
	}

}
