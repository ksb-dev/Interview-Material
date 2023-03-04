import java.util.*;

public class ReturnSubsetSumToK {

	public static void main(String[] args) {
		int[] input = {5, 12, 3, 17, 1, 18, 15, 3, 17 };
		ArrayList<ArrayList<Integer>> out = subsetsSumK(input, 6);

		int[][] result = new int[out.size()][];

		for(int i = 0; i < out.size(); i++) {
			//System.out.println(out.get(i));
			Integer[] array = out.get(i).toArray(new Integer[0]);
			int[] a = new int[array.length];

			for(int j = 0; j < array.length; j++) {
				a[j] = array[j];
			}
			result[i] = a;
		}
        //return result;

		for(int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}

	// Return a 2D array that contains all the subsets which sum to k
	public static ArrayList<ArrayList<Integer>> subsetsSumK(int arr[], int k) {
		// Write your code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

				// ArrayList to store the current subset.
		ArrayList<Integer> curSubset = new ArrayList<>();

		checkSubsets(arr, ans, curSubset, k, 0);

		return ans;
	}
    public static void checkSubsets(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curSubset, int k, int idx) {
		if (idx == arr.length) {
			if (k == 0 && curSubset.size() != 0) {
				ans.add(curSubset);
			}
			return;
		}

		// Case when we do not include the current element in the subset.
		checkSubsets(arr, ans, curSubset, k, idx + 1);

		// Case when we include the current element in the subset.
		ArrayList<Integer> curSubset1 = new ArrayList<>(curSubset);
        curSubset1.add(arr[idx]);

		checkSubsets(arr, ans, curSubset1, k - arr[idx], idx + 1);
	}
}