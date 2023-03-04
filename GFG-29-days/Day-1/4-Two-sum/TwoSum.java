import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int x = 0, y = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for(y = 0; y < nums.length; y++) {
			//System.out.println(target - nums[y] + " , " + map.get(target - nums[y]));

			if(map.containsKey(target - nums[y])) {
				x = map.get(target - nums[y]);

				result[0] = x;
				result[1] = y;

				break;
			}

			map.put(nums[y], y);
		}

		//System.out.println(map);

        return result;
    }
    public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 10, 8};
		int target = 16;

		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
}