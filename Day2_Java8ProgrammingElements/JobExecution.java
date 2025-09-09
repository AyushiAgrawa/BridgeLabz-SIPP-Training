package JavaFeature.Day2_Java8ProgrammingElements;

public class JobExecution {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Running background job...");
        Thread t = new Thread(job);
        t.start();
    }
}
