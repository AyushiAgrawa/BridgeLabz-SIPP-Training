package Generics.Day5_GenericsProgrammingElements.Regex;

import java.util.*;
public class SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.matches("\\b\\d{3}-\\d{2}-\\d{4}\\b")) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}
