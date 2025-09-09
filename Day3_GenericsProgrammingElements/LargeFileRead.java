package Generics.Day3_GenericsProgrammingElements;
import java.io.*;

public class LargeFileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("largefile.txt"));
        String line;
        while((line = br.readLine()) != null){
            if(line.toLowerCase().contains("error")){
                System.out.println(line);
            }
        }
        br.close();
    }
}
