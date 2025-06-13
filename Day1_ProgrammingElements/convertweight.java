import java.util.Scanner;
public class convertweight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weights in pounds: ");
		double weightinpounds = sc.nextDouble();
		double weightinkg = weightinpounds * 2.2;
		System.out.println("The weight of the person in pounds is "+ weightinpounds +" and in kg is "+weightinkg);

	}

}
