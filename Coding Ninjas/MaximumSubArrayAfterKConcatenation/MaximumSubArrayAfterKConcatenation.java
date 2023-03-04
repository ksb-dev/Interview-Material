import java.util.*;

public class MaximumSubArrayAfterKConcatenation {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//list.add(1);
		//list.add(-2);
		//list.add(1);

		//list.add(1);
		//list.add(3);

		list.add(-17);
		list.add(-278);
		list.add(-38);
		list.add(-4);
		list.add(-5);
		list.add(-67);

		//int k = 2;
		//int k = 3;
		int k = 7;
		int n = list.size();

		/*int[] arr = new int[n * k];
		int m = 0;

		for(int i = 0; i < k; i++) {
			for(int j = 0; j < n; j++) {
				arr[m] = list.get(j);
				m++;
			}
		}

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];

				if(sum > max) {
					max = sum;
				}
			}
		}*/


		long maxSum = Long.MIN_VALUE;
		long curSum = 0;

		for (int i = 0; i < n * k; i++)
		{
			curSum += list.get(i % n);

			System.out.println(i % n);
			System.out.println("i :"+i+" n :"+n);
			System.out.println("list.get(i % n) :"+list.get(i % n));
			System.out.println("curSum :"+curSum);

			maxSum = Math.max(maxSum, curSum);

			if (curSum < 0)
			{
				curSum = 0;
			}
		}

		//System.out.println(Arrays.toString(arr));
		System.out.println(maxSum);
	}
}