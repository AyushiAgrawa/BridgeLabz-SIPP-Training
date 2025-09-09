package Generics.Day5_GenericsProgrammingElements.JUnit;

public class DatabaseConnection {
    boolean connected = false;
    public void connect() { connected = true; }
    public void disconnect() { connected = false; }
    public boolean isConnected() { return connected; }
}
