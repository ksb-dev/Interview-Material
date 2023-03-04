import java.util.HashMap;

public class LargestSubarrayWithEqualNumberOf0and1 {
	public static void main(String[] args) {
		//int[] arr = {1, 0, 0, 1, 1, 1};
		int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 0, 0};

		int result = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);
		int sum  = 0;

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

				if(length > result) {
					result = length;
				}
				else {
					map.put(sum, 0);
				}
		    }
		}

		System.out.println(result);
	}
}