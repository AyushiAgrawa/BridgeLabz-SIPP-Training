package Generics.Day5_GenericsProgrammingElements.JUnit;

import java.io.*;
public class FileProcessor {
    public void writeToFile(String filename, String content) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) { bw.write(content); }
    }
    public String readFromFile(String filename) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) { return br.readLine(); }
    }
}
