import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base in cm:");
		double base = sc.nextDouble();
		System.out.println("Enter height in cm:");
		double height = sc.nextDouble();
        double areaincm = (0.5)* base * height;
        double baseinches = base / 2.54;
        double heightinches = height / 2.54;
        double areainches = (0.5) * baseinches * heightinches;
        System.out.println("The Area of triangle in sq in is "+ areainches +" and sq cm is " + areaincm);
	}

}
