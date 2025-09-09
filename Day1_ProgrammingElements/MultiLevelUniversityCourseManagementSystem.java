package Generics.Day1_ProgrammingElements;

import java.util.*;

abstract class CourseType {
    private String name;
    public CourseType(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract String evaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
    public String evaluationMethod() { return "Exam Based"; }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
    public String evaluationMethod() { return "Assignment Based"; }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
    public String evaluationMethod() { return "Research Based"; }
}

class Course<T extends CourseType> {
    private String courseCode;
    private T type;

    public Course(String courseCode, T type) {
        this.courseCode = courseCode;
        this.type = type;
    }

    public String getCourseCode() { return courseCode; }
    public T getType() { return type; }

    @Override
    public String toString() {
        return courseCode + " | " + type.getName() + " | " + type.evaluationMethod();
    }
}

class Department {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> c : courses) {
            System.out.println(c);
        }
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    public static void displayAll(List<? extends CourseType> courseTypes) {
        for (CourseType c : courseTypes) {
            System.out.println(c.getName() + " - " + c.evaluationMethod());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("MATH101", new ExamCourse("Mathematics"));
        Course<AssignmentCourse> cs = new Course<>("CS201", new AssignmentCourse("Data Structures"));
        Course<ResearchCourse> ai = new Course<>("AI501", new ResearchCourse("Artificial Intelligence"));

        Department dept = new Department();
        dept.addCourse(math);
        dept.addCourse(cs);
        dept.addCourse(ai);

        System.out.println("Department Courses:");
        dept.displayCourses();

        List<CourseType> courseTypes = Arrays.asList(
                new ExamCourse("Physics"),
                new AssignmentCourse("Software Engineering"),
                new ResearchCourse("Quantum Computing")
        );

        System.out.println("\nGeneral Course Types:");
        displayAll(courseTypes);
    }
}
