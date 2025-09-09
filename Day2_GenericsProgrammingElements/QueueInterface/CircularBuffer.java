package Generics.Day2_GenericsProgrammingElements.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer {
    public static void main(String[] args) {
        int bufferSize = 3;
        Queue<Integer> buffer = new LinkedList<>();

        int[] inputs = {1, 2, 3, 4};
        for (int val : inputs) {
            if (buffer.size() == bufferSize) {
                buffer.remove();
            }
            buffer.add(val);
        }

        System.out.println(buffer);
    }
}
