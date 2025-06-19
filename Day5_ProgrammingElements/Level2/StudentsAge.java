package Day5_ProgrammingElements.Level2;
import java.util.*;
public class StudentsAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (e.g., 10): ");
        int numberOfStudents = sc.nextInt();

        int[] ages = generateRandomAges(numberOfStudents);
        String[][] results = checkVotingEligibility(ages);

        System.out.println("\n--- Voting Eligibility Table ---");
        displayVotingTable(results);
	}
	public static int[] generateRandomAges(int numberOfStudents) {
	        Random random = new Random();
	        int[] ages = new int[numberOfStudents];
	        for (int i = 0; i < numberOfStudents; i++) {
	            ages[i] = random.nextInt(82) + 10;  
	        }
	        return ages;
	}
	public static String[][] checkVotingEligibility(int[] ages) {
	        String[][] result = new String[ages.length][2];

	        for (int i = 0; i < ages.length; i++) {
	            int age = ages[i];
	            result[i][0] = String.valueOf(age);

	            if (age < 0) {
	                result[i][1] = "false";  
	            } else if (age >= 18) {
	                result[i][1] = "true";   
	            } else {
	                result[i][1] = "false"; 
	            }
	        }
	        return result;
	 }
	 public static void displayVotingTable(String[][] votingData) {
	        System.out.printf("%-10s %-15s\n", "Age", "Can Vote");
	        System.out.println("-------------------------");
	        for (int i = 0; i < votingData.length; i++) {
	            System.out.printf("%-10s %-15s\n", votingData[i][0], votingData[i][1]);
	        }
	    }



}
