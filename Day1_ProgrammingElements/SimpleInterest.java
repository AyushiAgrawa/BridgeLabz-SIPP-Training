import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter time: ");
		double time = sc.nextDouble();
		
		double SI = (principal * rate * time)/100;
		System.out.println("Simple interest is "+ SI);

	}

}
