package Generics.Day4_GenericsProgrammingElements;
import java.util.*;

public class ThrowsExample {
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if(amount < 0 || rate < 0) throw new IllegalArgumentException();
        return amount * rate * years / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter years: ");
        int years = sc.nextInt();
        try {
            System.out.println("Interest: " + calculateInterest(amt, rate, years));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
        sc.close();
    }
}
