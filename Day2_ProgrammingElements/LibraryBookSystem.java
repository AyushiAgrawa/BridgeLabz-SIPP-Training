package Day2_ProgrammingElement.Level1;
import java.util.*;

class Books{
	private String title;
	private String author;
	private double price;
	private int availability;
	
	Books(String title, String author, double price, int availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	public void borrowbook() {
		if (availability > 0) {
			availability--;
			System.out.println("Book borrowed successfully!");
		} else {
			System.out.println("Sorry, this book is currently unavailable.");
		}
	}
	
	public void displayDetails() {
		System.out.println("\n--- Book Details ---");
		System.out.println("Title       : " + title);
		System.out.println("Author      : " + author);
		System.out.println("Price       : " + price);
		System.out.println("Available   : " + availability + " copies");
	}
}
public class LibraryBookSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Books book = new Books("Wings of Fire", "A.P.J Abdul Kalam", 350.0, 2);
		while (true) {
			System.out.println("--- Library Menu ---");
			System.out.println("1. Borrow Book");
			System.out.println("2. View Book Details");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();  
			switch (choice) {
				case 1:
					book.borrowbook();
					break;
				case 2:
					book.displayDetails();
					break;
				case 3:
					System.out.println("Exiting... Thank you for visiting!");
					return;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		}

	}

}
