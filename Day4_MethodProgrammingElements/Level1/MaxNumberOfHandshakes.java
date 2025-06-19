package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class MaxNumberOfHandshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students :");
		int numberOfStudents = sc.nextInt();
		
		if (numberOfStudents <= 1) {
			System.out.println("There is no student or only 1 students so no possible handshakes ");
		}else {
			int result = handshakes(numberOfStudents);
			System.out.println("There is " + numberOfStudents + " Students so possible handshakes are "+ result );
		}

	}
	public static int handshakes(int numberOfStudents) {
		 return (numberOfStudents *(numberOfStudents-1))/2;
	}

}
