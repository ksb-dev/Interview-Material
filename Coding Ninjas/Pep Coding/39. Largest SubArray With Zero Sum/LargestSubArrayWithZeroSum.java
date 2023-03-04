import java.util.*;

public class LargestSubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr = {-1, 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4};

		int i  = -1;
		int sum = 0;
		int length = 0;
		int maxLength = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(sum, i);

		while(i < arr.length - 1) {
			i++;

			sum += arr[i];

			if(map.containsKey(sum)) {
				length = i - map.get(sum);

				if(maxLength < length) {
					maxLength = length;
				}
			}
			else {
				map.put(sum, i);
			}
		}
		System.out.println(maxLength);

		/*HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int max_length = 0;

		int[] prefixarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				prefixarr[i] = arr[i];
			} else {
				prefixarr[i] = arr[i] + prefixarr[i - 1];
			}
			if (!map.containsKey(prefixarr[i])) {
				map.put(prefixarr[i], i);
			} else {
				max_length = Math.max(max_length, i - map.get(prefixarr[i]));
			}
		}

		System.out.println(max_length);*/
	}
}