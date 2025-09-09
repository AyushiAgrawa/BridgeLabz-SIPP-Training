package Day1_Programs.Day1_ProgramWorkshop;
import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;
        int vote;

        System.out.println("=== Smart Polling System ===");

        while (true) {
            System.out.print("Enter age of voter (or 0 to exit): ");
            int age = sc.nextInt();

            if (age == 0) {
                break; 
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Enter your vote (candidate 1, 2, or 3): ");
                vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        candidate1++;
                        break;
                    case 2:
                        candidate2++;
                        break;
                    case 3:
                        candidate3++;
                        break;
                    default:
                        System.out.println("Invalid vote. Vote not counted.");
                }

            } else {
                System.out.println("You are not eligible to vote.");
            }
        }
        System.out.println();
        System.out.println("=== Voting Summary ===");
        System.out.println("Candidate 1: " + candidate1 + " votes");
        System.out.println("Candidate 2: " + candidate2 + " votes");
        System.out.println("Candidate 3: " + candidate3 + " votes");
        
        sc.close();
    }
}
