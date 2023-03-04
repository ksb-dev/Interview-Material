import java.util.*;

public class CountSmallerOrEqualElementsInArray {
	public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		int[] b = {3, 4};

		int n = a.length;
		int m = b.length;

		List<Integer> arr = new ArrayList<>();

		Arrays.sort(b);

		// Traversing the array A
		for (int i = 0; i < n; i++) {

			int idx = upperBound(b, 0, m - 1, a[i]);
			arr.add(idx + 1);

		}
		System.out.println(arr);
    }

	private static int upperBound(int arr[], int l, int r, int element) {
		while (l <= r) {
			int mid = l + (r - l) / 2;

			if (arr[mid] <= element) {
				l = mid + 1;
			}

			else {
				r = mid - 1;
			}
		}
        return r;
	}
}