package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    Task t = new Task();
    
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTask() throws InterruptedException { t.longRunningTask(); }
}
