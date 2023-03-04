/*
Input: arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4

Output: 3 4 4 3

Explanation: First window is {1, 2, 1, 3}, count of distinct numbers is 3
                      Second window is {2, 1, 3, 4} count of distinct numbers is 4
                      Third window is {1, 3, 4, 2} count of distinct numbers is 4
                      Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
*/

import java.util.*;

public class CountDistinct {
	public static int bruteForce(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < k; i++) {

			int j;

			for (j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
			if(j == i) {
			    count++;
			}
		}
        return count;
	}

	public static void optimal(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		// Print count of first window
		System.out.println(map.size());

		// Traverse through the remaining array
		for (int i = k; i < arr.length; i++) {

			// Remove first element of previous window
			// If there was only one occurrence
			if (map.get(arr[i - k]) == 1) {
				map.remove(arr[i - k]);
			}

			else {
				// reduce count of the removed element
				map.put(arr[i - k], map.get(arr[i - k]) - 1);
			}

			// Add new element of current window
			// If this element appears first time,
			// set its count as 1,
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

			// Print count of current window
			System.out.println(map.size());
        }
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 3, 4, 2, 3};
		int k = 4;

		for(int i = 0; i <= arr.length - k; i++) {
		    //System.out.println(bruteForce(Arrays.copyOfRange(arr, i, arr.length), k));
	    }

	    optimal(arr, k);
	}
}