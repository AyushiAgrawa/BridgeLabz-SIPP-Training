package Day3_ProgrammingElements;

import java.util.Arrays;

public class BubbleSortStudentMarks {
    public static void main(String[] args) {
    	int[] arr = {30,23,10,67,45,90,100,45};
    	bubbleSort(arr);
    	System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSort(int[] arr) {
    	int n= arr.length;
    	
    	boolean swapped;
    	for(int i=0; i<n-1; i++) {
    		swapped = false;
    		for(int j=0; j<n-i-1; j++) {
    			if(arr[j] > arr[j+1]) {
    				int temp = arr[j];
    				arr[j]= arr[j+1];
    				arr[j+1] = temp;
    				swapped = true;
    			}
    		}
    		if(!swapped) break;
    	}
    }
}
