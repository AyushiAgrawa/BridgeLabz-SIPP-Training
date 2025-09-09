import java.io.*;

public class FileReadPerformance {
    public static void main(String[] args) throws Exception {
        String filePath = "largefile.txt";

        long start = System.nanoTime();
        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {}
        }
        long fileReaderTime = System.nanoTime() - start;

        start = System.nanoTime();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            while (isr.read() != -1) {}
        }
        long inputStreamReaderTime = System.nanoTime() - start;

        System.out.println("FileReader: " + fileReaderTime / 1_000_000.0 + " ms");
        System.out.println("InputStreamReader: " + inputStreamReaderTime / 1_000_000.0 + " ms");
    }
}
