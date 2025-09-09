package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.regex.*;
public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        Pattern p = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}");
        Matcher m = p.matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}
