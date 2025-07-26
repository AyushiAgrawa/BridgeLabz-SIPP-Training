package Day5_DSAProgrammingElement.BinarySearch;
import java.util.*;
public class FirstAndLastOccurence {

	public static void main(String[] args) {
		int[] arr = {2,56,34,89,1,5,7,4,5};
		int target = 5;
		
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		System.out.println( firstOccurence(arr, target));
		System.out.println(lastOccurence(arr, target));
	}

	private static int firstOccurence(int[] arr, int target) {
		int left = 0;
		int right = arr.length -1;
		int result = -1 ;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] == target) {
				result = mid;
				right = mid-1;
			}else if(arr[mid] < target){
				left = mid+1;
			}else {
				right = mid-1;
			}
			
		}
		return result;
	}
	
	private static int lastOccurence(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		int result =-1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(arr[mid] == target) {
				result = mid;
				left = mid+1;
			}else if(arr[mid] < target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		return result ;
	}
}
