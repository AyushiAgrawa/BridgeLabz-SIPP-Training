package Day1_ProgrammingElements.Level1;
import java.util.*;

class MobilePhone{
	private String brand;
	private String model;
	private double price; 
	
	public MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	
	}
	
	public void displayDetails() {
		System.out.println("---------Mobile Phone details--------- ");
		System.out.println("The brand of mobile phone is :"+brand);
		System.out.println("The model of mobile phone is : "+ model);
		System.out.println("The price of mobile phone is : "+ price);
	}
	
}
public class HandleMobilePhoneDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the brand of mobile phone is : ");
		String brand = sc.nextLine();
		System.out.print("Enter the model of mobile phone is : ");
		String model = sc.nextLine();
		System.out.print("Enter the price of mobile phone is : ");
		double price = sc.nextDouble();
		
		MobilePhone mobilephone = new MobilePhone(brand, model, price);
		mobilephone.displayDetails();
		
		sc.close();
		
	}

}
