package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author { String name(); }

@Author(name="John Doe")
class Book {}

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class ReflectionIntermediate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        MathOperations m = new MathOperations();
        System.out.print("Enter method: ");
        String methodName = sc.nextLine();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println(method.invoke(m, 10, 5));

        Author author = Book.class.getAnnotation(Author.class);
        System.out.println(author.name());

        Field apiField = Configuration.class.getDeclaredField("API_KEY");
        apiField.setAccessible(true);
        apiField.set(null, "NEW_KEY");
        System.out.println(apiField.get(null));
    }
}
