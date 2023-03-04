import java.util.*;

public class PairsWithDifferenceK {

	public static void main(String[] args) {
		int[] arr = {5, 1, 2, 4};
		int k = 3;

		int count = getPairsWithDifferenceK(arr, k);

		System.out.println(count);
	}

	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
        int n = arr.length;
		int count = 0;

		for(int i = 0; i < n; i++) {
			int difference = 0;

			for(int j = i; j < n - 1; j++) {
				difference += arr[j] - arr[j+1];

				System.out.println(difference);

				if(Math.abs(difference) == k) {
					count++;
				}
			}
		}
        return count;
	}
}