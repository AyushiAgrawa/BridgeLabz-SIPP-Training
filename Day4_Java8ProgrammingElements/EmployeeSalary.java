package JavaFeature.Day4_ProgrammingElements;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary) {
        this.name = name; this.department = department; this.salary = salary;
    }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Aman", "IT", 50000),
            new Employee("Bobby", "HR", 45000),
            new Employee("Chana", "IT", 60000),
            new Employee("Mohit", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryByDept);
    }
}
