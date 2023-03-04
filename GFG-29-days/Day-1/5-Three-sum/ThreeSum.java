import java.util.*;

class ThreeSum {
    public static List<List<Integer>> bruteForce(int[] arr) {
       Set<List<Integer>> answer = new HashSet<>();

	   // Sorting is only necessary for avoiding duplicates in the answer.
	   Arrays.sort(arr);

	   for (int i = 0; i < arr.length; i++) {
		   for (int j = i + 1; j < arr.length; j++) {
			   for (int k = j + 1; k < arr.length; k++) {
				   int sum = arr[i] + arr[j] + arr[k];

				   if (sum == 0) {
					   answer.add(Arrays.asList(arr[i], arr[j], arr[k]));
				   }
			   }
		   }
	   }
       return new ArrayList<>(answer);
    }

    public static List<List<Integer>> better(int[] arr) {
		Set<List<Integer>> answer = new HashSet<>();
		Arrays.sort(arr);
		int target = 0;

		for(int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int k = arr.length - 1;

			while(j < k) {
				int sum = arr[i] + arr[j] + arr[k];

				if(sum == target) {
					answer.add(Arrays.asList(arr[i], arr[j], arr[k]));
					j++;
					k--;
				}
				else if(sum < target) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		return new ArrayList<>(answer);
	}

    public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		//int[] arr = {0, 0, 0};

		List<List<Integer>> result1 = bruteForce(arr);
		List<List<Integer>> result2 = better(arr);

		System.out.println(result1);
		System.out.println(result2);
	}
}