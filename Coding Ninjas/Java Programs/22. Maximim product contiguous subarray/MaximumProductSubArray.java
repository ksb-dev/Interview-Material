import java.util.*;

class TestMaximiumProductSubArray{

	public int maximimProductSubArray(int[] a){

		// maintain two variables to store the maximum and minimum product
		        // ending at the current index
		        int max = 0;
		        int min = 0;

		        // to store the maximum product subarray found so far
		        int max_so_far = 0;

		        // traverse the given array
		        for (int i = 0; i < a.length; i++) // 2, -3, -2, 4
		        {
		            int temp = max;

		            // update the maximum product ending at the current index
		            max = Integer.max(a[i], Integer.max(a[i] * temp, a[i] * min));

		            System.out.println("max : "+max);

		            // update the minimum product ending at the current index
		            min = Integer.min(a[i], Integer.min(a[i] * temp, a[i] * min));

		            System.out.println("min : "+min);

		            max_so_far = Integer.max(max_so_far, max);

		            System.out.println("max_so_far : "+max_so_far);
		            System.out.println("---------------");
		        }

		        // return maximum product
        return max_so_far;
	}
}

public class MaximumProductSubArray{

	public static void main(String[] args){

		TestMaximiumProductSubArray t = new TestMaximiumProductSubArray();

		//int[] a = {-2, 0, -1};

		//int[] a = {-2, -3, 0, 1, -2, -40};

		int[] a = {2, -3, -2, 4};

		int result = t.maximimProductSubArray(a);

		//t.maximimProductSubArray(a);

		System.out.println(result);
	}
}