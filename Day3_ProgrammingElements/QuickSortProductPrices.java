package Day3_ProgrammingElements;

import java.util.Arrays;

public class QuickSortProductPrices {

	public static void main(String[] args) {
		int[] arr = {34,23,12,78,56,100,90};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	
	static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
	}
}
