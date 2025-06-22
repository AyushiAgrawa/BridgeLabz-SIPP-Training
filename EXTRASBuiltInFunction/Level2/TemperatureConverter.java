package EXTRASBuiltInFunction.Level2;
import java.util.*;
public class TemperatureConverter {
	public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
	
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.printf("Choose an option (1. Fahrenheit to Celsius or 2. Celsius to Fahrenheit): ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        } else if (option == 2) {
            System.out.println("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
	}

}
