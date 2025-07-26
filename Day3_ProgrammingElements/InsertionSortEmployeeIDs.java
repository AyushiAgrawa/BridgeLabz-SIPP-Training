package Day3_ProgrammingElements;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

	public static void main(String[] args) {
		int[] arr = {1,45,23,78,100,34,20};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
