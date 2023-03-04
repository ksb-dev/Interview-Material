import java.util.*;

public class FourSum {

	public static List<List<Integer>> bruteForce(int[] arr, int target) {
		Set<List<Integer>> set = new HashSet<>();

		Arrays.sort(arr);

		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					for(int l = k + 1; l < arr.length; l++) {

						int sum = arr[i] + arr[j] + arr[k] + arr[l];

						if(sum == target) {
							set.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
			            }
			        }
			    }
			}
		}
		return new ArrayList<>(set);
	}

	public static void main(String[] args) {
		int[] arr = {1, 0, -1, 0, -2, 2};
		int target = 0;

		//int[] arr = {2, 2, 2, 2, 2};
		//int target = 8;

		List<List<Integer>> result = bruteForce(arr, target);

		System.out.println(result);
	}
}