package Day5_DSAProgrammingElement.BinarySearch;

public class RotationPoint {

	public static void main(String[] args) {
		int[] arr = {9,3,5,6,1,2,7,7};
		System.out.println(binarySearch(arr));
	}
	
	static int binarySearch(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right= n-1;
		
		while(left < right) {	
			int mid = left + (right - left) /2;
			
			if(arr[mid] > arr[right]) {
				left = mid+1;
			}else if(arr[mid] < arr[right]) {
				right = mid;
			}
		}
		return arr[left];
	}

}
