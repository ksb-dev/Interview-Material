// You have been given an integer array/list (ARR) of size N.
// You have to return an array/list PRODUCT such that PRODUCT[i] is equal to the product of all the elements of ARR except ARR[i]


// Test case 1 : Given array = {1, 2, 3]
// Required array = [2 * 3, 1 * 3, 1 * 2] = [6, 3, 2]
// Test case 2 : Given array = {5, 2, 2]
// Required array = [2 * 2, 5 * 2, 5 * 2] = [4, 10, 10]

import java.util.*;

public class ProductOfAllElementsOfArrayExceptArrayOfi {

    public static void main(String[] args) {
		int[] arr = {4, 2, 3, 5, 6};
		int n = arr.length;

		int[] left_product = new int [n];
		int [] right_product = new int[n];

		left_product[0] = 1;
		right_product[n-1] = 1;

		int[] output = new int[n];

		for(int i = 1 ; i < n; i++){
			System.out.println("i :"+i);
			System.out.println("arr[i-1] :"+arr[i-1]);
			System.out.println("left_product[i-1] :"+left_product[i-1]);

			left_product[i] = arr[i-1] * left_product[i-1];

			System.out.println("left_product[i] :"+left_product[i]);
			System.out.println("----------------");
		}

		for(int i = n - 2 ; i >= 0; i--){
			System.out.println("i :"+i);
			System.out.println("arr[i+1] :"+arr[i+1]);
			System.out.println("right_product[i-1] :"+right_product[i+1]);

			right_product[i] = arr[i+1] * right_product[i+1];

			System.out.println("right_product[i] :"+right_product[i]);
			System.out.println("----------------");
		}

		for(int i = 0; i < n; i++){
			System.out.println("left_product[i] :"+left_product[i]);
			System.out.println("right_product[i] :"+right_product[i]);

			output[i] = left_product[i] * right_product[i];

			System.out.println("output[i] :"+output[i]);
		}
		System.out.println("----------------");

		System.out.println(Arrays.toString(output));
    }
}