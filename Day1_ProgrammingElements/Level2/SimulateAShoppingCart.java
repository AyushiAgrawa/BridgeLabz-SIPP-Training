package Day1_ProgrammingElements.Level2;
import java.util.*;

class CartItem{
	private String itemName;
	private double price;
	private int quantity;
	
	public CartItem() {
		this.itemName = "";
		this.price = 0.0;
		this.quantity = 0; 
	}
	
	public void allitem(int item) {
		switch(item) {
		case 1:
			itemName ="Sampoo";
			price = 100.0;
			break;
		
		case 2:
			itemName = "Oil";
			price = 60.0;
			break;
		case 3:
			itemName = "Facewash";
			price = 200.0;
			break;
			
		case 4:
			itemName = "Face Cream";
			price = 250.0;
			break;
			
		default:
			System.out.println("Invalid choice ");
			break;
		}
		System.out.println("Thank you for buying");
	}
	
	public void additem(int quantity) {
		this.quantity += quantity;
		System.out.println(quantity + " unit added to cart.");
	}
	
	public void removeitem(int quantity) {
		if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " unit removed from cart.");
        } else {
            System.out.println("Cannot remove more than present in cart.");
        }
	}
	
	 public void displayCart() {
	         System.out.println("--- Cart Summary ---");
	         System.out.println("Item      : " + itemName);
	         System.out.println("Quantity  : " + quantity);
	         System.out.println("Unit Price: " + price);
	         System.out.println("Total     : " + (price * quantity));
	     
	 }
}
public class SimulateAShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        CartItem cartItem = new CartItem();
        System.out.println("=== Welcome to the Store ===");
        System.out.println("1. Shampoo");
        System.out.println("2. Oil");
        System.out.println("3. Facewash");
        System.out.println("4. Face Cream");
        System.out.print("Enter item number (1-4): ");
        int itemChoice = sc.nextInt();

        cartItem.allitem(itemChoice);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        cartItem.additem(quantity);
        
        System.out.print("Do you want to remove any quantity? (yes=1 / no=0): ");
        int removeChoice = sc.nextInt();
        if (removeChoice == 1) {
            System.out.print("Enter quantity to remove: ");
            int quantityRemove = sc.nextInt();
            cartItem.removeitem(quantityRemove);
        }

        cartItem.displayCart();
        sc.close();

	}

}
