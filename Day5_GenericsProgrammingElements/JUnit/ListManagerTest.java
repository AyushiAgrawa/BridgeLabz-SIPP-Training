package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    ListManager lm = new ListManager();
    List<Integer> list = new ArrayList<>();
    
    @Test
    void testAddElement() {
        lm.addElement(list, 5);
        assertTrue(list.contains(5));
    }
    @Test
    void testRemoveElement() {
        lm.addElement(list, 10);
        lm.removeElement(list, 10);
        assertFalse(list.contains(10));
    }
    @Test
    void testGetSize() {
        list.clear();
        lm.addElement(list, 1);
        lm.addElement(list, 2);
        assertEquals(2, lm.getSize(list));
    }
}

