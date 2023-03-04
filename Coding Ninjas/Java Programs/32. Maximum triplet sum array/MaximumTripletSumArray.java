import java.util.*;

// Time complexity O(n^3)

class TestMaximumTripletSumArray{

	public int maximumTripletSumArray(int[] a){

		int sum1 = 0;
		int sum2 = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				for(int k = j + 1; k < a.length; k++){

					if(a[i] < a[j] && a[j] < a[k]){

						sum1 = a[i] + a[j] + a[k];

						if(sum1 > sum2){

							sum2 = sum1;
					    }
					}
				}
			}
		}

		return sum2;
	}
}

public class MaximumTripletSumArray{

	public static void main(String[] args){

		 TestMaximumTripletSumArray t = new  TestMaximumTripletSumArray();

		 //int[] a = {2, 5, 3, 1, 4, 9};

		 int[] a = {1, 2, 3};

		 int result = t.maximumTripletSumArray(a);

		 System.out.println(result);
	 }
 }
