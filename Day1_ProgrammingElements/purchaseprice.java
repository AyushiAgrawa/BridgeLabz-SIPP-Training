import java.util.Scanner;
public class purchaseprice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price of one unit: ");
		double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity : ");
        double quantity = sc.nextDouble();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR "+ total+" if the quantity "+ quantity + " and the unit price is INR "+ unitPrice);
	}

}
