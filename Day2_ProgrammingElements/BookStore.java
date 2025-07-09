package Day2_ProgrammingElement.Level1;
import java.util.*;

class Book{
	private String title;
	private String author;
	private double price = 0.0;
	
	Book(){
		title = "Four Stars of Destiny";
		author = "General Manoj Mukund Naravane";
		price = 600.0;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		this.price = bookdetails();
	}
	
	private double bookdetails() {
		double price = switch(title.toLowerCase()) {
		case "wings of fire" -> 350.0;
		case "the alchemist" -> 299.0;
		case "ikigai" -> 250.0;
		default -> this.price; 
		};
		return price;
	}
	
	public void displayresults() {
		System.out.println();
		System.out.println("Title : "+title);
		System.out.println("Author: "+author);
		System.out.println("price: "+ price);
	}
}
public class BookStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title: ");
		String title = sc.nextLine();
		System.out.println("Enter book author: ");
		String author = sc.nextLine();
		
		Book book1 = new Book();
		book1.displayresults();
		
		Book book2 = new Book(title, author );
		book2.displayresults();

	}

}
