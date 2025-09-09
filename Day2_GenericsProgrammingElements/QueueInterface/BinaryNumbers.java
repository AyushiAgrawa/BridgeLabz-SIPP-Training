package Generics.Day2_GenericsProgrammingElements.QueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    public static void main(String[] args) {
        int N = 5;
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String front = queue.remove();
            System.out.print(front + " ");
            queue.add(front + "0");
            queue.add(front + "1");
        }
    }
}
