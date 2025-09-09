package Generics.Day5_GenericsProgrammingElements.JUnit;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
    FileProcessor fp = new FileProcessor();
    
    @Test
    void testWriteRead() throws IOException {
        String filename = "test.txt";
        fp.writeToFile(filename,"Hello");
        assertEquals("Hello", fp.readFromFile(filename));
        new File(filename).delete();
    }
    
    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> fp.readFromFile("nofile.txt"));
    }
}
