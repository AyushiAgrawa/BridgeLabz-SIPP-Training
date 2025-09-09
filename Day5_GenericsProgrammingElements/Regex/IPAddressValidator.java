package Generics.Day5_GenericsProgrammingElements.Regex;
import java.util.*;
public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        if(ip.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$"))
            System.out.println("Valid");
        else System.out.println("Invalid");
        sc.close();
    }
}
