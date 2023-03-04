import java.util.*;

public class LongestSubset {

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 1, 1};

		HashMap<Integer, Integer> hM  = new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Initialize result
		int max_len = 0;
		int start_index = 0;
		int ending_index = -1;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		// Traverse through the given array
		for (int i = 0; i < n; i++) {
			// Add current element to sum

			sum += arr[i];

			// To handle sum=0 at last index
			if (sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}

			// If this sum is seen before,
			// then update max_len if required
			if (hM.containsKey(sum)) {
				if (max_len < i - hM.get(sum)) {
					max_len = i - hM.get(sum);
					ending_index = i;
				}
			}
			else // Else put this sum in hash table
				hM.put(sum, i);
		}


		int end = ending_index - max_len + 1;

        System.out.println(max_len);

        /*HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int ans = 0;

        for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				sum += -1;
			}
			else if(arr[i] == 1) {
				sum += 1;
			}

			if(map.containsKey(sum)) {
				int index = map.get(sum);
				int length = i - index;

				if(length > ans) {
					ans = length;
				}
			}
			else {
				map.put(sum, i);
			}
		}
		System.out.println(sum);*/
	}
}