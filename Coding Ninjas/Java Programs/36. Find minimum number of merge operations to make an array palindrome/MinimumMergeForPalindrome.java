import java.util.*;

class TestMinimumMergeForPalindrome{

	public int testMinimumMergeForPalindrome(int[] a){

		int result = 0;

		for(int i =0, j = a.length - 1; i <= j;){

			if(a[i] == a[j]){

				i++;
				j--;
			}
			else if(a[i] > a[j]){

				j--;

				a[j] += a[j + 1];

				result++;

			}
			else{

				i++;

				a[i] += a[i - 1];

				result++;
			}

			//System.out.println(Arrays.toString(a));
		}

		return result;
	}
}

public class MinimumMergeForPalindrome{

	public static void main(String[] args){

		TestMinimumMergeForPalindrome t = new TestMinimumMergeForPalindrome();

		 int[] a = {11, 14, 15, 99};

		 //int[] a = {1, 4, 5, 1};

		 //int[] a = {15, 4, 15};

		 int result = t.testMinimumMergeForPalindrome(a);

		 System.out.println(result);
	}
}