import java.util.*;

class TestThreeWayPartitioning{

	public int[] threeWayPartitioning(int[] arr, int lowVal, int highVal){

		        // Initialize ext available positions for
		        // smaller (than range) and greater lements
		        int start = 0;
		        int end = arr.length - 1;

		         // Traverse elements from left
		        for(int i = 0; i <= end;){

		            // If current element is smaller than
		            // range, put it on next available smaller
		            // position.

		            if(arr[i] < lowVal){

		                int temp = arr[start];
		                arr[start] = arr[i];
		                arr[i] = temp;
		                start++;
		                i++;

		            }

		            // If current element is greater than
		            // range, put it on next available greater
		            // position.
		            else if(arr[i] > highVal){

		                int temp = arr[end];
		                arr[end] = arr[i];
		                arr[i] = temp;
		                end--;

		            }

		            else
		               i++;
        }

		/*int[] b = new int[a.length];
		int j = 0;

		for(int i = 0; i < a.length; i++){

			if(a[i] < k1){

				b[j] = a[i];
				j++;
			}
		}

		for(int i = 0; i < a.length; i++){

			if(a[i] >= k1 && a[i] <= k2){

				b[j] = a[i];
				j++;
			}
		}

		for(int i = 0; i < a.length; i++){

			if(a[i] > k2){

				b[j] = a[i];
				j++;
			}
		}*/

		return arr;
	}
}

public class ThreeWayPartitioning{

	public static void main(String[] args){

		TestThreeWayPartitioning t = new TestThreeWayPartitioning();

		int[] a = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

		int k1 = 14;
		int k2 = 20;

		int[] result = t.threeWayPartitioning(a, k1, k2);

		System.out.println(Arrays.toString(result));
	}
}