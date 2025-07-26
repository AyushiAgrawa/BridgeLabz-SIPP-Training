package Day5_DSAProgrammingElement;
import java.util.*;
import java.util.Arrays;

public class ChallengeProblem {

	public static void main(String[] args) {
		int[] arr = {1,3,4,6,3,5,-1};
		int target = 6;
		
		Arrays.sort(arr);
		System.out.println("Sorted array: "+ Arrays.toString(arr));
		System.out.println("missing number : "+missingPositiveNumber(arr));
		System.out.println("index of target 6 is: " + target(arr, target));
	}

	private static int missingPositiveNumber(int[] arr) {
		
		Set<Integer> seen = new HashSet<>();
		for(int num : arr) {
			if(num >0) seen.add(num);
		}
		
		int i=1;
		while(true) {
			if(!seen.contains(i)) return i;
			i++;
		}
	}
	
	private static int target(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
