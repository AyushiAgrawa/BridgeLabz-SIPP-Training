package Day2_ProgrammingElement.Level1;
import java.util.*;
public class Person {
    private String name;
    private int age;
    private long number;
    
    Person(String name, int age, long number){
    	this.name = name;
    	this.age = age;
    	this.number = number;
    }
    
    Person(Person previousdetails){
    	this.name = previousdetails.name;
    	this.age =  previousdetails.age;
    	this.number = previousdetails.number;
    }
    
    void displaydetails() {
    	System.out.println();
    	System.out.println("----Person's details----");
    	System.out.println(" Name: "+name);
    	System.out.println(" Age : "+age);
    	System.out.println(" Number: "+ number);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of person: ");
        String name = sc.nextLine();
        System.out.println("Enter age of person: ");
        int age = sc.nextInt();
        System.out.println("Enter number of person: ");
        long number = sc.nextLong();
       
        Person person1 = new Person(name, age, number);
        person1.displaydetails();
        
        Person person2 = new Person(person1);
        person2.displaydetails();
        
	}

}
