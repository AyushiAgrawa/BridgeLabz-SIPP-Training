package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.regex.*;
public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is Rs.45.99, and the discount is 10.50.";
        Pattern p = Pattern.compile("\\Rs.?\\d+(\\.\\d{1,2})?");
        Matcher m = p.matcher(text);
        while(m.find()) System.out.println(m.group());
    }
}
