package Day3_ProgrammingElements;

import java.util.Arrays;

public class SelectionSortExamScores {
	static void selectionSort(int[] arr) {
		int n= arr.length;
		
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
	}
	public static void main (String[] args) {
		int[] arr = {3,4,5,1,67,23,100,45};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
           
}
