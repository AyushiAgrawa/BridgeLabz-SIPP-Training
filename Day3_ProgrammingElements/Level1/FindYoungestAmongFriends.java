package Day3_ProgrammingElements.Level1;
import java.util.Scanner;
public class FindYoungestAmongFriends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of Amar: ");
		int amarage = sc.nextInt();
		System.out.println("Enter age of Akbar: ");
        int akbarage = sc.nextInt();
        System.out.println("Enter age of Anthony: ");
        int anthonyage = sc.nextInt();
        
        System.out.println("Enter height of Amar: ");
        float amarheight = sc.nextFloat();
        System.out.println("Enter height of Akbar: ");
        float akbarheight = sc.nextFloat();
        System.out.println("Enter height of Anthony: ");
        float anthonyheight = sc.nextFloat();
     
        if((amarage < akbarage) && (amarage < anthonyage)) {
        	System.out.println("Amar is youngest friend");
        }else if((akbarage < amarage) && (akbarage < anthonyage)) {
        	System.out.println("Akbar is youngest friend");
        }else {
        	System.out.println("Anthony is youngest friend");
        }
        
        if((amarheight > akbarheight) && (amarheight > anthonyheight)) {
        	System.out.println("Amar is  tallest friend");
        }else if((akbarheight > amarheight) && (akbarheight > anthonyheight)) {
        	System.out.println("Akbar is tallest friend");
        }else {
        	System.out.println("Anthony is tallest friend");
        }
        
	}

}
