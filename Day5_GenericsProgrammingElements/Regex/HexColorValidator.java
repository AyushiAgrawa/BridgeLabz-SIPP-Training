package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.*;
public class HexColorValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        if(hex.matches("^#[0-9a-fA-F]{6}$")) System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}
