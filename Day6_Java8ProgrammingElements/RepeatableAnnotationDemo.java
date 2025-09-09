package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport { String description(); }

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports { BugReport[] value(); }

class Sample {
    @BugReport(description="Bug1")
    @BugReport(description="Bug2")
    void method() {}
}

public class RepeatableAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method m = Sample.class.getMethod("method");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for(BugReport r : reports) System.out.println(r.description());
    }
}
