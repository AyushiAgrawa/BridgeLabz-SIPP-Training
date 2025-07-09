package Day1_ProgrammingElements.Level1;
import java.util.*;

class Item{
	private String itemCode;
	private String itemName;
	private double price;
	
	public Item(String itemCode, String itemName, double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public double totalCost(int quantity) {
		return price * quantity;
	}
	
	public void displayDetails() {
		System.out.println("the ItemCode of item is: "+itemCode);
		System.out.println("the ItemName of item is: "+itemName);
		System.out.println("the price of item is: "+price);
		
	}
}
public class TrackInventoryItems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter itemCode of a item: ");
		String Code = sc.nextLine();
		System.out.println("Enter itemName of a item: ");
		String Name = sc.nextLine();
		System.out.println("Enter price of item: ");
		double price = sc.nextDouble();
		
		Item item = new Item(Code, Name, price);
		item.displayDetails();
		
		System.out.println("Enter the quantity of item: ");
		int quantity = sc.nextInt();
		double totalCost = item.totalCost(quantity);
		System.out.println("the total cost of item is: "+ totalCost);
		
		sc.close();
	}

}
