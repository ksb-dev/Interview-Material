import java.util.*;

public class MaximumFrequencyNumber {
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 2, 3, 2, 1, 1, 2, 3};

		/*Arrays.sort(arr);
		int count = 1;
		int max = 1;
		int result = 0;

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				count++;
				if(count > max) {
					max = count;
					result = arr[i-1];
				}
			}
			else {
				count = 1;
			}
		}

		 if(count > max) {
		     max = count;
		     result = arr[arr.length - 1];
		 }*/

		 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		 		for (int i : arr) {
					System.out.println("i :"+i);
		 			hm.put(i, hm.getOrDefault(i, 0) + 1);
		 			//System.out.println(hm);
		 			//System.out.println(hm.getOrDefault(i, 0));
		 		}

		 		int max = 0, ans = Integer.MIN_VALUE;

		 		for (int i : arr) {
		 			if (hm.get(i) > max) {
		 				max = hm.get(i);
		 				ans = i;
		 			}
		 		}

		//return ans;
		//System.out.println(hm);
		System.out.println(ans);
	}
}