/*

Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.

Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

*/

import java.util.*;

public class ArrayPairSumDivisibleByK {
	public static boolean bruteForce(int[] arr, int k) {
		int count = 0;
		boolean result = false;


		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if((arr[i] + arr[j]) % k  == 0) count++;

				if(count == (arr.length / 2)) {
					result = true;
					break;
				}
			}
		}
		//System.out.println("count : " + count);
		return result;
	}

	public static boolean optimal(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; i++) {
			int remainder = ((arr[i] % k) + k) % k;

			int oldFrequency = map.getOrDefault(remainder, 0);
			map.put(remainder, oldFrequency + 1);
		}

		for(int i = 0; i < arr.length; i++) {
			int remainder = ((arr[i] % k) + k) % k;

			if(remainder == 0 || 2 * remainder == k) {
				if(map.get(remainder) % 2 == 1) {
					return false;
				}
			}
			else {
				int frequency1 = map.get(remainder);
				int frequency2 = map.getOrDefault((k - remainder), 0);

				if(frequency1 != frequency2) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
		int k = 5;

		//int[] arr = {1, 2, 3, 4, 5, 6};
		//int k = 10;
		//int k = 7;

		System.out.println(bruteForce(arr, k));
		System.out.println(optimal(arr, k));
	}
}