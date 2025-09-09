package Generics.Day4_GenericsProgrammingElements;
import java.util.*;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
        sc.close();
    }
}
