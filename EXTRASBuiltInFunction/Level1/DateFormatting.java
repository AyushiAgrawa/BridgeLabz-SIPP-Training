package EXTRASBuiltInFunction.Level1;
import java.time.LocalDate;
import java.time.format.*;
public class DateFormatting {

	public static void main(String[] args) {
		LocalDate currentdate = LocalDate.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM, dd, YYYY");
		System.out.println("Format 1 (dd/MM/yyyy): " + currentdate.format(format1));
        System.out.println("Format 2 (yyyy-MM-dd): " + currentdate.format(format2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentdate.format(format3));
	}

}
