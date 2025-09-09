package Generics.Day5_GenericsProgrammingElements.JUnit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    DatabaseConnection db;
    
    @BeforeEach
    void setup() { db = new DatabaseConnection(); db.connect(); }
    @AfterEach
    void teardown() { db.disconnect(); }
    
    @Test
    void testConnect() { assertTrue(db.isConnected()); }
    @Test
    void testDisconnect() { db.disconnect(); assertFalse(db.isConnected()); }
}
