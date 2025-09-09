package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod { String level() default "HIGH"; }

class DemoClass {
    @ImportantMethod void m1() {}
    @ImportantMethod(level="LOW") void m2() {}
}

public class ImportantMethodDemo {
    public static void main(String[] args) throws Exception {
        for(Method m : DemoClass.class.getDeclaredMethods()) {
            if(m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " " + im.level());
            }
        }
    }
}
