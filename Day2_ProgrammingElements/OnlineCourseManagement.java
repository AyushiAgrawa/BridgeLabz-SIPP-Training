package Day2_ProgrammingElement.Level1;
import java.util.*;
class Course{
	private String courseName;
	private String duration;
	private double fee;
	static private String instituteName = "GLA University";
	
	Course(String courseName, String duration, double fee ){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails(){
		System.out.println();
		System.out.println("The name of Course is "+courseName);
		System.out.println("The duration of course is : "+duration);
		System.out.println("The fees of course is : "+fee);
		System.out.println();
	}
	
	static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }
	
	static void displayinstituteName() {
		System.out.println("The institute name is : "+instituteName);
	}
}
public class OnlineCourseManagement {

	public static void main(String[] args) {
		Course c1 = new Course("Computer Science", "4 years" , 150000);
		Course c2 = new Course("Electrical Engineering ", "4 years" , 120000);
		Course c3 = new Course("Mechanical Engineering", "4 years" , 140000);
		
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		c3.displayCourseDetails();
		
		Course.displayinstituteName();
		
		Course.updateInstituteName("BridgeLabz SIPP Training");
		System.out.println();
		System.out.println("After updating institute name: ");
		Course.displayinstituteName();
	}

}
