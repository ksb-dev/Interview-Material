import java.util.*;

public class NonDecreasingArrayByModifyingAtMostOneElement {

	public static boolean isNonDecreasing(int[] arr) {
		// Time Complexity O(n)
		// Space complexity O(1)
		int count1 = 0;
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < max)
				count1++;
			else
				max = arr[i];
		}

		int count2 = 0;
		int min = arr[arr.length-1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > min)
				count2++;
			else
				min = arr[i];
		}
        return Math.min(count1, count2) < 2;
	}

	public static void main(String[] args) {
		//int[] arr = {4, 2, 3};
		int[] arr = {4, 2, 1};

		System.out.println(isNonDecreasing(arr));
	}
}