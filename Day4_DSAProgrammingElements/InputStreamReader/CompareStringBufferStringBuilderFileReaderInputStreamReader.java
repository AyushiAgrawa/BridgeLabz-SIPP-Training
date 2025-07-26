package Day4_DSAProgrammingElements.InputStreamReader;

import java.io.*;

public class CompareStringBufferStringBuilderFileReaderInputStreamReader {

    public static void main(String[] args) {
        try {
            // Compare StringBuffer
            String s = "hello";
            StringBuffer sb = new StringBuffer();

            long start = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                sb.append(s);
            }
            long end = System.nanoTime();
            System.out.println("Time for StringBuffer: " + (end - start) + " ns");

            // Compare StringBuilder
            StringBuilder sbr = new StringBuilder();
            long starttime = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                sbr.append(s);
            }
            long endtime = System.nanoTime();
            System.out.println("Time for StringBuilder: " + (endtime - starttime) + " ns");

            // Compare FileReader
            String file = "Filejava";  // Make sure the file exists in the root directory

            long startfile = System.nanoTime();
            int wordcountfr = countWordsUsingFileReader(file);
            long endFile = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordcountfr);
            System.out.println("Time taken with FileReader: " + (endFile - startfile) / 1_000_000 + " ms");

            // Compare InputStreamReader
            long startInputStreamReader = System.nanoTime();
            int wordCountISR = countWordsUsingInputStreamReader(file);
            long endInputStreamReader = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCountISR);
            System.out.println("Time taken with InputStreamReader: " + (endInputStreamReader - startInputStreamReader) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int countWordsUsingFileReader(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.isEmpty()) count += words.length;
        }
        br.close();
        return count;
    }

    public static int countWordsUsingInputStreamReader(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.isEmpty()) count += words.length;
        }
        br.close();
        return count;
    }
}
