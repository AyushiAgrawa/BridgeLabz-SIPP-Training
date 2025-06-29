import java.util.Scanner;
public class MaxNumberOfHandshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int numberOfStudents = sc.nextInt();
		int numberofHandshakes = (numberOfStudents * (numberOfStudents -1 )) / 2;
		System.out.println("The possible number of Handshakes is "+numberofHandshakes);
		
	}

}
