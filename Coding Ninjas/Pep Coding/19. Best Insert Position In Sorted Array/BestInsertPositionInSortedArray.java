public class BestInsertPositionInSortedArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7};
		int n = arr.length;
		int m = 6;

		int lo = 0;
		int hi = n - 1;
		int ans = -1;

		while(lo <= hi){

			int mid = lo + (hi - lo) / 2;
			// Check if element is present.
			if(arr[mid] == m){
				System.out.println(mid);
			}

			// Check in left half.
			if(arr[mid] > m){
				hi = mid - 1;
				ans = mid;
			}
			// Check in right half.
			else{
				lo = mid + 1;
			}
		}

		if(ans == -1) {
			ans = n;
		}

	    System.out.println(ans);
	}
}