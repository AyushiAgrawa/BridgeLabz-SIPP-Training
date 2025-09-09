import java.util.*;

public class SearchTargetInLargeDataset{
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000, 1000000};
        Random rand = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = rand.nextInt(n * 10);

            int target = arr[rand.nextInt(n)];

            long start = System.nanoTime();
            linearSearch(arr, target);
            long linearTime = System.nanoTime() - start;

            Arrays.sort(arr);

            start = System.nanoTime();
            binarySearch(arr, target);
            long binaryTime = System.nanoTime() - start;

            System.out.println("Dataset Size: " + n);
            System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
            System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
            System.out.println("--------------------------------------");
        }
    }
}
