package JavaFeature.Day2_Java8ProgrammingElements;
import java.text.*;
import java.util.*;

interface DateUtils {
    static String formatDate(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Formatted: " + DateUtils.formatDate(now, "dd-MM-yyyy"));
    }
}
