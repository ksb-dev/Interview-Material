public class SearchInRotatedSortedArray {

	public static void main(String[] args) {

		int[] a = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int target = 9;

		int low = 0;
		int high = a.length - 1;

		while(low <= high) {
			int middle = (low + high) / 2;

			if(a[middle] == target) {
				System.out.println("target :"+target);
				System.out.println("index :"+middle);
				return;
			}
			else if(a[low] <= a[middle]) {
				if(target >= a[low] && target < a[middle]) {
					high = middle - 1;
				}
				else {
					low = middle + 1;
			    }
			}
			else if(a[middle] <= a[high]) {
				if(target > a[middle] && target <= a[high]) {
					low = middle + 1;
				}
				else {
					high = middle - 1;
				}
			}
		}
		System.out.println(-1);
	}
}
