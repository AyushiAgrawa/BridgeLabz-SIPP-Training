package Day1_Programs.Day1_ProgramWorkshop;
import java.util.*;
public class StudentTestScores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
        while (true) {
            System.out.print("Enter the number of students: ");
            try {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Number of students must be positive.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.nextLine(); 
            }
        }

        int[] student = new int[n];

        for (int i = 0; i < student.length; i++) {
            while (true) {
                System.out.print("Enter marks for student " + (i + 1) + ": ");
                try {
                    int marks = sc.nextInt();
                    if (marks < 0) {
                        System.out.println("Marks cannot be negative. Please enter again.");
                    } else {
                        student[i] = marks;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    sc.nextLine(); 
                }
            }
        }
		int highest = student[0];
        int lowest = student[0];
        int sum = 0;

        for (int i = 0; i < student.length; i++) {
            if (student[i] > highest) {
                highest = student[i];
            }
            if (student[i] < lowest) {
                lowest = student[i];
            }
            sum += student[i];
        }
        double average = (double) sum / n;
        
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);

        sc.close();
	}

}
