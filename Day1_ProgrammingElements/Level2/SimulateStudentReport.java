package Day1_ProgrammingElements.Level2;
import java.util.*;

class Student{
	private String name;
	private int rollNumber;
	private int marks;
	
	public Student(String Name, int RollNumber, int Marks) {
		this.name = Name;
		this.rollNumber = RollNumber;
		this.marks = Marks;
	}
	
	public String Grade(int marks){
		
		if(marks >= 90) {
			return "A";
		}else if(marks >= 75) {
			return "B";
		}else if(marks >= 60) {
			return "C";
		}else if(marks>=45) {
			return "D";
		}else {
			return "E";
		}
		
	}
	
	public void displayResults() {
		System.out.println("----Here are all the information of student----");
		System.out.println("The name of student is "+ name);
		System.out.println("The Roll Number of student is "+ rollNumber);
		System.out.println("The marks of student is "+ marks);
		System.out.println("The grade of student is "+ Grade(marks));
	}
}
public class SimulateStudentReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter the roll number of student: ");
		int roll = sc.nextInt();
		System.out.println("Enter the marks of student: ");
		int marks = sc.nextInt();
		Student student = new Student(name, roll, marks);
		student.displayResults();
		
		sc.close();
	}

}
