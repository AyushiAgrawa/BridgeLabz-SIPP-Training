package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    NumberUtils nu = new NumberUtils();
    
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void testIsEven(int n) { 
        if(n % 2 == 0) assertTrue(nu.isEven(n));
        else assertFalse(nu.isEven(n));
    }
}
