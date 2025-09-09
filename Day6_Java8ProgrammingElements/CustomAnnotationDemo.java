package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority="HIGH", assignedTo="Alice")
    void task1() {}
}

public class CustomAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("task1");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println(info.priority() + " " + info.assignedTo());
    }
}
