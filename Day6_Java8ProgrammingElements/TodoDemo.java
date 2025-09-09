package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task="Add login", assignedTo="Alice")
    void feature1() {}
    @Todo(task="Add logout", assignedTo="Bob", priority="HIGH")
    void feature2() {}
}

public class TodoDemo {
    public static void main(String[] args) throws Exception {
        for(Method m : Project.class.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(m.getName() + " " + t.task() + " " + t.assignedTo() + " " + t.priority());
            }
        }
    }
}
