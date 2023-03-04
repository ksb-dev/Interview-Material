import java.util.*;

class TestSmallestSubArray{

	public int smallestSubArray(int[] a, int x){

		//Arrays.sort(a);

		int count1 = 0;
		int count2 = 0;
		int min_numbers = 0;
		int sum = 0;

		for(int i = 0; i < a.length; i++){

            sum = 0;
			count1 = 0;

			for(int j = i; j < a.length; j++){// 1, 4, 45, 6, 0, 19

				sum += a[j];

				count1++;

				if(sum > x){

					min_numbers = count1;

					count2 = Math.min(min_numbers, count1);

					count1 = 0;
				}
			}
		}

		return (count2 - count1);
	}
}

public class SmallestSubArray{

	public static void main(String[] args){

		TestSmallestSubArray t = new TestSmallestSubArray();

		//int[] a = {1, 4, 45, 6, 0, 19}; // x = 51

		//int[] a = {1, 10, 5, 2, 7}; // x = 9

		int[] a = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}; // x = 280

		//int[] a = {1, 2, 4};

		int x = 280;

		int result = t.smallestSubArray(a, x);

		if(result != -1){

			System.out.println("We need "+result+" elements to make a sum greater than "+x);
		}
		else{

			System.out.println("It is not possible to make a sum greater than "+x+" with the given array");
		}
	}
}