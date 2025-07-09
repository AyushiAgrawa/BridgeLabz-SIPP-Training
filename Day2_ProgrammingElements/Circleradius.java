package Day2_ProgrammingElement.Level1;
import java.util.*;

class Circle{
	private double radius;

	Circle(){
	    radius = 5.677;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void displaydetails() {
		System.out.println("The radius is "+radius);
	}
}
public class Circleradius {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the radius of circle: ");
	    double radius = sc.nextDouble();
	    
        Circle circle1 = new Circle();
        circle1.displaydetails();
        Circle circle2 = new Circle(radius);
        circle2.displaydetails();
        
	}

}
