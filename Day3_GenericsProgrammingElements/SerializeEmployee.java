package Generics.Day3_GenericsProgrammingElements;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SerializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Ashi","IT",50000));
        list.add(new Employee(2,"Ram","HR",40000));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"));
        List<Employee> newList = (List<Employee>) ois.readObject();
        for(Employee e: newList) {
            System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
        }
        ois.close();
    }
}
