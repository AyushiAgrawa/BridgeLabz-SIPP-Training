package EXTRASBuiltInFunction.Level1;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesandZonedDateTime {

	public static void main(String[] args) { 
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time: " + gmt);
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time: " + ist);
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time: " + pst);
	}

}
