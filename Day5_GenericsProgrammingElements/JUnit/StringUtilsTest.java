package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils su = new StringUtils();
    
    @Test
    void testReverse() { assertEquals("olleh", su.reverse("hello")); }
    @Test
    void testIsPalindrome() { assertTrue(su.isPalindrome("madam")); }
    @Test
    void testToUpperCase() { assertEquals("HELLO", su.toUpperCase("hello")); }
}
