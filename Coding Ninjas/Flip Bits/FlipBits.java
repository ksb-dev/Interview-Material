public class FlipBits {
	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0};
		int n = arr.length;

		int totalOnes = 0;

		// Initialize overall maximum difference for any subArray
		int max = 0;

		// Initialize current difference
		int currMax = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 1) {
				totalOnes++;
			}

			// Value to be considered for finding maximum sum
			int val = 0;

			if (arr[i] == 1) {
				val = -1;
			} else {
				val = 1;
			}

			currMax = Math.max(val, currMax + val);
			max = Math.max(max, currMax);
		}
		max = Math.max(0, max);
		int result = totalOnes + max;

		System.out.println(result);
	}
}