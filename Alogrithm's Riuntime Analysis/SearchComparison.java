import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int n = 1_000_000;
        int target = n - 1;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = i;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) hashSet.add(i);

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) treeSet.add(i);

        long start = System.nanoTime();
        boolean foundArray = false;
        for (int x : array) {
            if (x == target) {
                foundArray = true;
                break;
            }
        }
        long arrayTime = System.nanoTime() - start;

        start = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        long hashTime = System.nanoTime() - start;

        start = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        long treeTime = System.nanoTime() - start;

        System.out.println("Array Search: " + arrayTime / 1_000_000.0 + " ms");
        System.out.println("HashSet Search: " + hashTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet Search: " + treeTime / 1_000_000.0 + " ms");
    }
}
