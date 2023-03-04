import java.util.*;

public class PairSumTo0 {
	public static void main(String[] args) {
		//int[] arr = { 8, 7, 2, 5, 3, 1 };
		//int[] arr = {2, 1, -2, 2, 3};
		int[] arr = {-2, 2, 6, -2, 2, -6, 3};
		//int[] arr = {2, 1, -2, 2, 3};
		//int[] arr = {0, 0, 0, 0, 0};
		int n = arr.length;
		int sum = 0;
		int count = 0;

		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		    // Traverse through all elements
		for(int i = 0; i < n; i++) {

			// Search if a pair can be formed with
			// arr[i].
			int rem = sum - arr[i];
			System.out.println("rem : "+rem);

			if (mp.containsKey(rem)) {
				count += mp.get(rem);
				System.out.println("count : "+count);
			}
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			}
			else {
				mp.put(arr[i], 1);
			}
			System.out.println(mp);
			System.out.println("----------");
         }
         System.out.println(count);
	}
}