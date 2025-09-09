package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.reflect.*;
import java.util.*;

class Person {
    private int age;
    public Person() { age = 20; }
}

class Calculator {
    private int multiply(int a, int b) { return a * b; }
}

class Student {
    public String name;
    public int id;
    public Student() { name = "Default"; id = 1; }
}

public class ReflectionBasics {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        Class<?> cls = Class.forName(className);
        Arrays.stream(cls.getMethods()).forEach(System.out::println);
        Arrays.stream(cls.getFields()).forEach(System.out::println);
        Arrays.stream(cls.getConstructors()).forEach(System.out::println);

        Person p = new Person();
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p, 25);
        System.out.println(ageField.get(p));

        Calculator c = new Calculator();
        Method multiply = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiply.setAccessible(true);
        System.out.println(multiply.invoke(c, 5, 4));

        Class<Student> studentClass = Student.class;
        Student s = studentClass.getDeclaredConstructor().newInstance();
        System.out.println(s.name + " " + s.id);
    }
}
