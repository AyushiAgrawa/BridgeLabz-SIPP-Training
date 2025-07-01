package Day2_ProgrammingElement.Level1;
import java.util.*;
public class HotelBooking {
	
    private String guestName;
    private String roomType;
    private int nights;
    
    HotelBooking(){         //default
    	guestName = "guest";
    	roomType = "Normal"; 
    	nights = 4;
    }
    
    HotelBooking(String guestName, String roomType, int nights){
    	this.guestName = guestName;    //Parameterized
    	this.roomType = roomType;
    	this.nights = nights;
    }
    
    HotelBooking(HotelBooking previousbooking){ //copy
    	this.guestName = previousbooking.guestName;
    	this.roomType = previousbooking.roomType;
    	this.nights = previousbooking.nights;
    }
    
    void displayresults() {
    	System.out.println();
    	System.out.println("The name is :"+ guestName );
    	System.out.println("The room type is : "+roomType);
    	System.out.println("The nights you are staying is : "+nights);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter the type of room you want:  ");
		String room = sc.nextLine();
		System.out.println("How many nights you want to stay: ");
		int nights = sc.nextInt();
		
		HotelBooking booking1 = new HotelBooking();
		booking1.displayresults();
		HotelBooking booking2 = new HotelBooking(name, room, nights);
		booking2.displayresults();
		HotelBooking booking3 = new HotelBooking(booking2);
		booking3.displayresults();
	}

}
