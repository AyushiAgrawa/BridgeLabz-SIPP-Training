package Day2_ProgrammingElement.Level1;
class Student{
	public int rollNumber;
	protected String name;
	private double CGPA;
	
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	 public double getCGPA() {
	    return CGPA;
	 }
	    
	 public void setCGPA(double CGPA) {
	    this.CGPA = CGPA;
	 }
}

class PostgraduateStudent extends Student {
    String course;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String course) {
        super(rollNumber, name, CGPA);
        this.course = course;
    }

    void showName() {
       System.out.println("Postgraduate Student Name: " + name);
    }
}
public class UniversityManagementSystem {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Anayaa", 8.5);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Old CGPA: " + s1.getCGPA());

        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();
        PostgraduateStudent pg = new PostgraduateStudent(2, "Gagan", 9.2, "M.Tech");
        System.out.println("Roll Number: " + pg.rollNumber);
        pg.showName();

	}

}
