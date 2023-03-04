import java.util.*;

public class InfiniteArray {

	public static int getSum(int[] arr, int L, int R) {
		// Time Complexity O(n)
		// Space complexity O(1)

		int sum = 0;
		int N = arr.length;

		        // Traverse from L to R
		for (int i = L - 1; i < R; i++) {
			sum += arr[i % N];
        }

        return sum;
	}

	public static void main(String[] args) {
		int[] arr = {5, 2, 6, 9};
		int left = 10;
		int right = 13;

		System.out.println(getSum(arr, left, right));
	}
}