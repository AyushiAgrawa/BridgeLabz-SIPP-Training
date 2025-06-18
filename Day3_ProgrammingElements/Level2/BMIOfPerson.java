package Day3_ProgrammingElements.Level2;
import java.util.Scanner;
public class BMIOfPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight :");
		double weight = sc.nextDouble();
		System.out.println("Enter height :");
		double heightcm = sc.nextDouble();

        double heightMeters = heightcm / 100;
        double bmi = weight / (heightMeters * heightMeters);
        
        System.out.println("Your BMI is : " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25.0 && bmi < 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
	}

}
