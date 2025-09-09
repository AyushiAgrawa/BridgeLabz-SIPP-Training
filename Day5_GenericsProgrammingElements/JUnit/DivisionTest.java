package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    Division d = new Division();
    
    @Test
    void testDivide() { assertEquals(2, d.divide(4,2)); }
    @Test
    void testDivideByZero() { assertThrows(ArithmeticException.class, () -> d.divide(5,0)); }
}
