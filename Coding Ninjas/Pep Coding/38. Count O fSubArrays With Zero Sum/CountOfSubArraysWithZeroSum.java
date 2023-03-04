import java.util.*;

public class CountOfSubArraysWithZeroSum {
	public static void main(String[] args) {
		int[] arr = {-1, 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};

		int i  = -1;
		int sum = 0;
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);

		while(i < arr.length - 1) {
			i++;

			sum += arr[i];

			if(map.containsKey(sum)) {
				count += map.get(sum);

				map.put(sum, map.get(sum) + 1);
			}
			else {
				map.put(sum, 1);
			}
		}
		System.out.println(count);
	}
}