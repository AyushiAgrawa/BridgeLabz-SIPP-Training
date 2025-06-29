import java.util.Scanner;
public class TemperaturConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		double Celsius = sc.nextFloat();
		double farenheitResult = (Celsius * (1.8))+ 32 ;
		System.out.println("The " + Celsius +" celsius is "+ farenheitResult + " fahrenheit");

	}

}
