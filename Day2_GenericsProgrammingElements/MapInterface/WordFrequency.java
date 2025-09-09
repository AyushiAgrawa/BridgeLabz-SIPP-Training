package Generics.Day2_GenericsProgrammingElements.MapInterface;
import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
