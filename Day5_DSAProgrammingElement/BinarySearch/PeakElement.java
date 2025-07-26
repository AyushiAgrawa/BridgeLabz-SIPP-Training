package Day5_DSAProgrammingElement.BinarySearch;

public class PeakElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,6,8,4,9};
		System.out.println(binarySearch(arr));
	}

	static int binarySearch(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		
		while(left <= right) {
			int mid = (left + right)/2;
			
			boolean leftSmall = (mid ==0 || arr[mid] > arr[mid-1]);
			boolean rightSmall = (mid == n-1 || arr[mid] > arr[mid+1]);
			
			if(leftSmall && rightSmall) {
				return arr[mid];
			}else if(mid>0 && arr[mid] < arr[mid-1]){
			    right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return -1;
	}
}
