package Generics.Day3_GenericsProgrammingElements;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        HashMap<String,Integer> map = new HashMap<>();
        String line;
        while((line = br.readLine()) != null){
            String[] words = line.split("\\W+");
            for(String w: words){
                if(w.isEmpty()) continue;
                w = w.toLowerCase();
                map.put(w,map.getOrDefault(w,0)+1);
            }
        }
        br.close();
        map.entrySet().stream()
           .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
           .limit(5)
           .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
