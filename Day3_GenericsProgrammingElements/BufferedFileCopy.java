package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        File src = new File("source.txt");
        File dest = new File("destination.txt");

        long start1 = System.nanoTime();
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream("unbuffered_copy.txt");
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        fis.close();
        fos.close();
        long end1 = System.nanoTime();
        System.out.println("Unbuffered time: " + (end1 - start1));

        long start2 = System.nanoTime();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        bis.close();
        bos.close();
        long end2 = System.nanoTime();
        System.out.println("Buffered time: " + (end2 - start2));
    }
}
