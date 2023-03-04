import java.util.*;

class TestMinimumSwaps{

	public int minimumSwaps(int[] arr, int k){

	int n = arr.length;

	// Find count of elements which are
	// less than equals to k
	int count = 0;
	for (int i = 0; i < n; ++i)
		if (arr[i] <= k)
			++count;

	// Find unwanted elements in current
	// window of size 'count'
	int bad = 0;
	for (int i = 0; i < count; ++i)
		if (arr[i] > k)
			++bad;

	// Initialize answer with 'bad' value of
	// current window
	int ans = bad;
	for (int i = 0, j = count; j < n; ++i, ++j) {

		// Decrement count of previous window
		if (arr[i] > k)
			--bad;

		// Increment count of current window
		if (arr[j] > k)
			++bad;

		// Update ans if count of 'bad'
		// is less in current window
		ans = Math.min(ans, bad);
	}
	return ans;
	}
}

public class MinimumSwaps{

	public static void main(String[] args){

		TestMinimumSwaps t = new TestMinimumSwaps();

		//int[] a = {2, 1, 5, 6, 3};

		int[] a = {2, 7, 9, 5, 8, 7, 4, 4};

		int k = 6;

		int result = t.minimumSwaps(a, k);

		System.out.println(result);
	}
}