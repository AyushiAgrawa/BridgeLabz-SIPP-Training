package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.*;
public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.replaceAll("\\s+", " "));
        sc.close();
    }
}
