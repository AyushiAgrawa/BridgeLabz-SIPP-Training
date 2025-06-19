package Day5_ProgrammingElements.Level1;
import java.util.*;
public class ArrayException {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter the index you want to access : ");
        int index = sc.nextInt();
        System.out.println("Calling generateException() (without try-catch):");
        try {
            generateException(names, index);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }
        System.out.println("\nCalling handleException() (with try-catch):");
        handleException(names, index);
	}
    public static void generateException(String[] names, int index) {
        System.out.println("element at index " + index + ": " + names[index]);
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("element at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }
}
