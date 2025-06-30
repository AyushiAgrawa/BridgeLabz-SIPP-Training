package Day2_ProgrammingElement.Level1;

class Employee{
	public String employeeID;
	protected String department;
	private double salary;
	
	Employee(String employeeID, String department, double salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
	
	public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showDetails() {
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department: " + department);   
        System.out.println("Salary: " + getSalary());       
    }
}
public class EmployeeRecords {

	public static void main(String[] args) {
		Manager manager = new Manager("A45", "IT", 100000.0);
		manager.showDetails();
		manager.setSalary(120000);
		

	}

}
