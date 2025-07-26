package Day3_ProgrammingElements;

import java.util.Arrays;

public class CountingSortStudentAges {

	public static void main(String[] args) {
		int[] arr = {4,3,56,23,11,10,100};
		CountingSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void CountingSort(int[] arr) {
		int n = arr.length;
		if(n ==0) return;
		
		int max = arr[0];
		for(int num: arr) {
			if (num > max) max = num;
		}
		
		int[] count= new int[max+1];
		
		for(int num:arr) {
			count[num]++;
		}
		int index =0;
		for(int i=0; i<count.length; i++) {
			while(count[i]-- > 0) {
				arr[index++] = i;
			}
		}
	}

}
