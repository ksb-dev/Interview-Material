import java.util.*;

public class ZeroSumSubArray {
	public static void main(String[] args) {
		int[] input = {4, -407, 400, 7, 2};

		Set<Integer> hs = new HashSet<Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Traverse through the given array
		for (int i = 0; i < input.length; i++) {
			// Add current element to sum
			sum += input[i];

			// Return true in following cases
			// a) Current element is 0
			// b) sum of elements from 0 to i is 0
			// c) sum is already present in hash map
			if (input[i] == 0 || sum == 0 || hs.contains(sum))
				System.out.println(true);

			// Add sum to hash set
			hs.add(sum);
		}

		// We reach here only when there is
		// no subarray with 0 sum
        System.out.println(true);
	}
}