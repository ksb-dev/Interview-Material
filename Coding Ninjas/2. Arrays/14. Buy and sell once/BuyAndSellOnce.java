import java.util.*;

public class BuyAndSellOnce {

	public static int getProfit(int[] arr) {
		// Time Complexity O(n)
		// Space complexity O(1)

		int minSoFar = arr[0];
		int maxProfit = 0;

		for(int i = 1; i < arr.length; i++) {
			minSoFar = Math.min(minSoFar, arr[i]);
			int profit = arr[i] - minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 6, 4};
		//int[] arr = {7, 6, 4, 3, 1};
		int profit = getProfit(arr);

		System.out.println(profit);
	}
}

/*
// Brute force

int maxProfit = 0;
int profit = 0;

for(int i = 0; i < arr.length; i++) {
	for(int j = i + 1; j < arr.length; j++) {
		profit = arr[j] - arr[i];

		if(profit > maxProfit) {
			maxProfit = profit;
		}
	}
}
return maxProfit;

// Time complexity O(n^2)
// Space complexity O(1)

*/