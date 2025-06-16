package Day3_ProgrammingElements;
import java.util.Scanner;
public class ForLoopForRocketLaunch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countdown = sc.nextInt();
		for(int i = countdown ; i > 1; i--){
			System.out.println(i);
		}	
	}

}
