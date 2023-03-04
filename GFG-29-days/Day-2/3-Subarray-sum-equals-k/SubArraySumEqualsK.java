import java.util.*;

public class SubArraySumEqualsK {
	public static int bruteForce(int[] arr, int k) {
		int count = 0;

		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];

				if(sum == k) count++;
			}
		}
		return count;
	}

	public static int optimal(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int sum = 0;

		map.put(0, 1);

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if(map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			/*

			For subaary sum equal to 0

			if(map.containsKey(sum)) {
				count += map.get(sum);
			}

			*/
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {10, 2, -2, -20, 10};
		int k = -10;

		//int[] arr = {9, 4, 20, 3, 10, 5};
		//int k = 33;

		//int[] arr = {1,1,1};
		//int k = 2;

		//int[] arr = {1,2,3};
		//int k = 3;

		//System.out.println(bruteForce(arr, k));
		System.out.println(optimal(arr, k));
	}
}