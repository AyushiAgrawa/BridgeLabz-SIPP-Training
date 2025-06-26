package Day1_ProgrammingElements.Level1;
import java.util.*;
class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary) {
    	this.name = name;
    	this.id = id;
    	this.salary = salary;
    }
    
    public void displayDetails() {
    	System.out.println("Employee details: ");
    	System.out.println("Name: " + name);
    	System.out.println("ID: "+ id);
    	System.out.println("salary: "+salary);
    }

}

public class DisplayEmployeeDetails{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Employee: ");
		String name = sc.nextLine();
		System.out.println("Enter id of the employee: ");
		int id = sc.nextInt();
		System.out.println("Enter salary of the employee: ");
		double salary = sc.nextDouble();
		
		Employee employee = new Employee(name, id, salary);
		employee.displayDetails();
		
		sc.close();
	}
}
