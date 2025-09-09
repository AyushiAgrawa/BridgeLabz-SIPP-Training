package Generics.Day2_GenericsProgrammingElements.MapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Ayesha", "HR"),
            new Employee("Bobby", "IT"),
            new Employee("Chanchal", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee e : employees) {
            grouped.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }

        System.out.println(grouped);
    }
}

