package Day5_DSAProgrammingElement.LinearSearch;

import java.util.Arrays;

public class FirstNeativeNumber {

	public static void main(String[] args) {
		int[] arr = {3,5,2,7,-1,-2,45};
		
		System.out.println(linearSearch(arr));
	}
	
	static int linearSearch(int[] arr) {
		int i;
		for(i=0; i<arr.length-1; i++) {
			if(arr[i] <0) {
				return i;
			}
		}
		return -1;
	}

}
