package Generics.Day2_GenericsProgrammingElements.SetInterface;
import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}
