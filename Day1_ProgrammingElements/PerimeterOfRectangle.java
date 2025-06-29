import java.util.Scanner;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		double length = sc.nextDouble();
		System.out.println("Enter width of rectangle: ");
		double width = sc.nextDouble();
		
		double perimeter = 2 * (length + width);
		System.out.println("The perimeter of rectangle is "+ perimeter);

	}

}
