package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class MultiplicationFrom6to9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		for(int i=6; i<=9; i++) {
			System.out.println(n + " * "+ i + " = "+(n *i));
		}

	}

}
