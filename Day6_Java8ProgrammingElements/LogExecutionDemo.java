package JavaFeature.Day6_Java8ProgrammingElements;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class SampleMethods {
    @LogExecutionTime void fast() { for(int i=0;i<1000;i++); }
    @LogExecutionTime void slow() { for(int i=0;i<1000000;i++); }
}

public class LogExecutionDemo {
    public static void main(String[] args) throws Exception {
        SampleMethods sm = new SampleMethods();
        for(Method m : SampleMethods.class.getDeclaredMethods()) {
            if(m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(sm);
                long end = System.nanoTime();
                System.out.println(m.getName() + " -> " + (end-start));
            }
        }
    }
}
