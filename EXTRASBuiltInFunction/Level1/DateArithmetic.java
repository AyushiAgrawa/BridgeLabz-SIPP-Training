package EXTRASBuiltInFunction.Level1;
import java.util.*;
import java.time.LocalDate;
public class DateArithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date(yyyy-mm-dd) : ");
	    String s = sc.nextLine();
		LocalDate date = LocalDate.parse(s);
		LocalDate adddate = date.plusDays(7).plusMonths(1).plusYears(2);
		LocalDate FinalDate = adddate.minusWeeks(3);
		System.out.println("The final date after adding 7 days, 1 month, and subtracting 3 weeks is "+ FinalDate);
	}

}
