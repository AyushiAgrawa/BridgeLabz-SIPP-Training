package Generics.Day5_GenericsProgrammingElements.JUnit;

public class Task {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Done";
    }
}
