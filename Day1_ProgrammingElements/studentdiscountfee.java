import java.util.Scanner;
public class studentdiscountfee {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter fee:");
	  int fee = sc.nextInt();
	  System.out.println("Enter discount: ");
	  int discountPercent = sc.nextInt();
	  int discount = (discountPercent * fee)/100;
	  System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR "+ (fee-discount));

	}

}
