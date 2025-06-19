package Day5_ProgrammingElements.Level2;
import java.util.*;
public class MarksPercentage {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int numberOfStudents = sc.nextInt();

	        int[][] scores = generateScores(numberOfStudents);
	        double[][] stats = calculateStatistics(scores);
	        String[] grades = calculateGrades(stats);

	        System.out.println("\n--- Student Scorecard ---");
	        displayScorecard(scores, stats, grades);
	}
	public static int[][] generateScores(int numberOfStudents) {
	        Random rand = new Random();
	        int[][] scores = new int[numberOfStudents][3]; 
	        for (int i = 0; i < numberOfStudents; i++) {
	            scores[i][0] = rand.nextInt(41) + 60; 
	            scores[i][1] = rand.nextInt(41) + 60; 
	            scores[i][2] = rand.nextInt(41) + 60; 
	        }
	        return scores;
	 }
	 public static double[][] calculateStatistics(int[][] scores) {
	        int n = scores.length;
	        double[][] stats = new double[n][3]; // 0=Total, 1=Average, 2=Percentage

	        for (int i = 0; i < n; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double average = total / 3.0;
	            double percentage = (total / 300.0) * 100;

	            stats[i][0] = total;
	            stats[i][1] = Math.round(average * 100.0) / 100.0;
	            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
	        }

	        return stats;
	 }
	 public static String[] calculateGrades(double[][] stats) {
	        String[] grades = new String[stats.length];

	        for (int i = 0; i < stats.length; i++) {
	            double percent = stats[i][2];

	            if (percent >= 90) grades[i] = "A";
	            else if (percent >= 80) grades[i] = "B";
	            else if (percent >= 70) grades[i] = "C";
	            else if (percent >= 60) grades[i] = "D";
	            else if (percent >= 50) grades[i] = "E";
	            else grades[i] = "F";
	        }

	        return grades;
	 }
	 public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
	        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-8s\n",
	                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
	        System.out.println("---------------------------------------------------------------------------------------------");

	        for (int i = 0; i < scores.length; i++) {
	            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8s\n",
	                    (i + 1),
	                    scores[i][0],
	                    scores[i][1],
	                    scores[i][2],
	                    stats[i][0],
	                    stats[i][1],
	                    stats[i][2],
	                    grades[i]);
	        }
	    }

}
