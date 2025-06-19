package Day4_MethodProgrammingElements.Level1;
import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
        int result = checknumber(number);
        System.out.println(result);
	}
	
	public static int checknumber(int number) {
		if(number < 0) {
			return -1;
		}else if(number == 0) {
			return 0;
		}else {
			return 1;
		}
	}

}
