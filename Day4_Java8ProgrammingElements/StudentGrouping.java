package JavaFeature.Day4_ProgrammingElements;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;
    Student(String name, String grade) { this.name = name; this.grade = grade; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aman", "A"),
            new Student("Bobby", "B"),
            new Student("Charlie", "A"),
            new Student("mohit", "C")
        );

        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.grade,
                Collectors.mapping(s -> s.name, Collectors.toList())
            ));

        System.out.println(studentsByGrade);
    }
}
