package EXTRASBuiltInFunction.Level1;
import java.time.LocalDate;
import java.util.*;
public class DateComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one date(yyyy-mm-dd): ");
		String date1 = sc.nextLine();
		LocalDate firstDate = LocalDate.parse(date1);
		System.out.println("Enter another date(yyyy-mm-dd): ");
		String date2 = sc.nextLine();
		LocalDate SecondDate = LocalDate.parse(date2);
		
		if(firstDate.isBefore(SecondDate)) {
			System.out.println(date1 + " is before "+ date2);
		}else if(firstDate.isAfter(SecondDate)) {
			System.out.println(date1 + " is after "+ date2);
		}else if(firstDate.isEqual(SecondDate)) {
			System.out.println(date1 + " is equal "+ date2);
		}
	}

}
