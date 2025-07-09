package Day1_ProgrammingElements.Level1;
import java.util.*;

class Circle{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double CalculateArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public double CalculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public void displayDetails() {
		System.out.println("Radius of circle: "+ radius);
		System.out.println("Area of circle : "+ CalculateArea(radius));
		System.out.println("Circumference of circle : "+ CalculateCircumference(radius));

	}
}
public class ComputeAreaofCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double radius = sc.nextDouble();
		
		Circle circle = new Circle(radius);
		circle.displayDetails();
		
		sc.close();
	}

}
