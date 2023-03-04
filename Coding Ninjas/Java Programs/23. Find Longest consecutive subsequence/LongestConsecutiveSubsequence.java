import java.util.*;

class TestLongestConsecutiveSubsequence{

	public int longestConsecutiveSubsequence(int[] a){

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		int count1 = 1;
		int count2 = 1;

		for(int j = 0; j < a.length - 1; j++){

			if(a[j] != a[j + 1]){

				if(a[j] == (a[j + 1] -1)){

					count1++;

				}
				else{

					if(count1 > count2){

						count2 = count1;
					}

					count1 = 1;
			    }
			}
		}

		if(count1 > count2){

			return count1;
		}

		return count2;
	}
}

public class LongestConsecutiveSubsequence{

	public static void main(String[] args){

		TestLongestConsecutiveSubsequence t = new TestLongestConsecutiveSubsequence();

		//int[] a = {1, 2, 3, 4, 6, 7};

		//int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10};

		//int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18};

		//int[] a = {1, 2, 4, 6, 7, 8, 10, 12, 13, 14, 15};

		//int[] a = {6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};

		int[] a = {1, 2, 3, 4, 5};

		int result = t.longestConsecutiveSubsequence(a);

		System.out.println(result);
	}
}