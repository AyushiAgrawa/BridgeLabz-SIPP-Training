package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class PipedCommunication {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello from Writer".getBytes());
                pos.close();
            } catch (IOException e) { }
        });

        Thread reader = new Thread(() -> {
            try {
                int b;
                while((b = pis.read()) != -1) {
                    System.out.print((char)b);
                }
                pis.close();
            } catch (IOException e) { }
        });

        writer.start();
        reader.start();
    }
}

