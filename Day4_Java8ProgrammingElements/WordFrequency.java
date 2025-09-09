package JavaFeature.Day4_ProgrammingElements;
import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world java java";
        Map<String, Long> freqMap = Arrays.stream(paragraph.split("\\s+"))
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(freqMap);
    }
}
