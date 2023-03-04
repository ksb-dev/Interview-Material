public class TrappedRainWater {
    public static long getTrappedWater(long[] arr) {
        // Your code goes here.
        int n = arr.length;

        long result = 0;

        // maximum element on left and right
        long left_max = 0, right_max = 0;

        // indices to traverse the array
        int low = 0, high = n - 1;

        while (low <= high) {

            if (arr[low] < arr[high]) {

                if (arr[low] > left_max) {
					// update max in left
                    left_max = arr[low];
			    }
                else {
                    // water on curr element = max - curr
                    result += left_max - arr[low];
				}
				low++;
            }
            else {
                if (arr[high] > right_max) {
                    // update right maximum
                    right_max = arr[high];
				}
                else{
                    result += right_max - arr[high];
				}
                high--;
            }
        }

        return result;
    }
    public static void main(String[] args) {
		long[] arr = {5, 1, 0, 5};
		System.out.println(getTrappedWater(arr));
	}
}

// Time complexity O(n)
// Space complexity O(1)

/*
int res = 0;

    // For every element of the array
    // except first and last element

    for(int i = 1; i < n - 1; i++){

        // Find maximum element on its left

        int left = arr[i];

        for(int j = 0; j < i; j++) {
            left = Math.max(left, arr[j]);
        }

        // Find maximum element on its right

        int right = arr[i];

        for(int j = i + 1; j < n; j++) {
            right = Math.max(right, arr[j]);
        }

        // Update maximum water value
        res += Math.min(left, right) - arr[i];
    }
    return res;
*/