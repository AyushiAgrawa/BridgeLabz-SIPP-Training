package Day1_ProgrammingElements.Level2;
import java.util.*;

class MovieTicket{
	private String movieName;
	private String seatNumber;
	private double price;
	
	public MovieTicket(){
		this.movieName = "";
		this.seatNumber = "";
		this.price = 0.0;
	}
	
	public void Moviebook(int movie) {
		Random random = new Random();
		int row = random.nextInt(10)+1;
		char seat = (char)(random.nextInt(20) + 'A');
		seatNumber = row + "" + seat;
		
		switch (movie) {
		    case 1:
		    	movieName = "Intersteller";
		    	price = 300.0;
		    	break;
		    	
		    case 2:
		    	movieName = "Jadugar";
		    	price = 250.0;
		    	break;
		    	
		    case 3:
		    	movieName = "3 idiots";
		    	price = 250.0;
		    	break;
		    	
		    default :
		    	System.out.println("Invalid movie");
		    	return;
		}
		System.out.println("Ticket booked");
	}
	
	public void displayresults() {
		System.out.println("---Ticket Details---");
		System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : " + price);
	}
	
}
public class MovieTicketBookingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Movie Selection----");
        System.out.println("1. Intersteller");
        System.out.println("2. Jadugar ");
        System.out.println("3. 3 idiots");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
		MovieTicket movieticket = new MovieTicket() ;
		movieticket.Moviebook(choice);
		System.out.println();
		movieticket.displayresults();
		

	}

}
