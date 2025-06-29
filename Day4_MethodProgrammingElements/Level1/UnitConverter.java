package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class UnitConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit : ");
		double fahrenheit = sc.nextDouble();
		System.out.println("Enter temp in celsius : ");
		double celsius = sc.nextDouble();
		System.out.println("Enter weight in pounds : ");
		double pounds = sc.nextDouble();
		System.out.println("Enter weight in kilograms : ");
		double kilograms = sc.nextDouble();
		System.out.println("Enter quantity in gallons : ");
		double gallons = sc.nextDouble();
		System.out.println("Enter quantity in liters : ");
		double liters = sc.nextDouble();
		
		System.out.println( fahrenheit + " fahrenheit in Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println(celsius +" celsius in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds+ " pounds in kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println(kilograms + " kilograms in pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println(gallons +" gallons in liters: " + convertGallonsToLiters(gallons));
        System.out.println(liters +" liters in gallons: " + convertLitersToGallons(liters));

	}
	public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

}
