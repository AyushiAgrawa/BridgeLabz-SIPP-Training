package Generics.Day2_GenericsProgrammingElements.ListInterface;
import java.util.ArrayList;
import java.util.List;

public class RotateElements {

    public static <T> List<T> rotateList(List<T> list, int positions) {
        List<T> rotated = new ArrayList<>();
        int size = list.size();
        positions = positions % size;
        for (int i = 0; i < size; i++) {
            rotated.add(list.get((i + positions) % size));
        }
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int rotateBy = 2;
        List<Integer> result = rotateList(numbers, rotateBy);
        System.out.println(result);
    }
}
