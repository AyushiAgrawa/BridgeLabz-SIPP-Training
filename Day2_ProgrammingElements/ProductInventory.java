package Day2_ProgrammingElement.Level1;

class Product{
	private String productName;
	private double price;
	private static int totalProducts = 100;
	
	Product(String productName, double price){
		this.price = price;
		this.productName = productName;
	}
	
	void displaydetails() {
		System.out.println();
		System.out.println("The productName is "+productName);
		System.out.println("The price is "+price);
		System.out.println();
	}
    static void displayTotalProduct() {
		System.out.println("Total Products Created: " + totalProducts);
	}
	
}
public class ProductInventory {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 55000.0);
		Product p2 = new Product("Smartphone", 22000.0);
		Product p3 = new Product("Monitor", 8500.0);

		System.out.println("--- Product Details ---");
		p1.displaydetails();
		p2.displaydetails();
		p3.displaydetails();
		
		Product.displayTotalProduct();

	}

}
