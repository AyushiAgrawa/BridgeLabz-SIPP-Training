package Day3_ProgrammingElements;

import java.util.Arrays;

public class MergeSortBookPrices {

	public static void main(String[] args) {
		int[] arr = {56,34,23,10,67,100,30,20};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
     
	static void mergeSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int mid = left+ (right-left)/2;
		
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		merge(arr, left, mid, right);
	}
	
	static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid -left+1;
		int n2= right - mid;
		
		int[] leftarray = new int[n1];
		int[] rightArray = new int[n2];
		
		System.arraycopy(arr, left, leftarray, 0, n1);
		System.arraycopy(arr, mid+1, rightArray, 0, n2);
		
		int i=0, j=0, k = left;
		
		while(i<n1 && j<n2) {
			if(leftarray[i] <= rightArray[j]) {
				arr[k++] = leftarray[i++];
			}else {
				arr[k++] = rightArray[j++];
			}
		}
		while(i<n1) arr[k++] = leftarray[i++];
		while(j<n2) arr[k++] = rightArray[j++];
	}
}
