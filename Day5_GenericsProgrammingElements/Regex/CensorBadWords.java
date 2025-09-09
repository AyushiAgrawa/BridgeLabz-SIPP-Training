package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.*;
public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] badWords = {"damn","stupid"};
        for(String word : badWords) input = input.replaceAll("(?i)\\b"+word+"\\b","****");
        System.out.println(input);
        sc.close();
    }
}
