import java.util.*;

class TestTrappingRainWater{

	public int testTrappingRainWater(int[] a){

		if(a.length == 0){

			return 0;
		}

		System.out.println(Arrays.toString(a)+"\n");

        int n = a.length;

	    int left[] = new int[n];

	    int right[] = new int[n];

	    left[0] = a[0];

	    for(int i = 1; i < n; i++)
	    {

		  System.out.println("left[i - 1] : "+left[i - 1]+" a[i] : "+a[i]);

	      left[i] = Math.max(left[i - 1], a[i]);

	       System.out.println("left[i] : "+left[i]);
	    }

	    System.out.println("---------------------------");

	    right[n - 1] = a[n - 1];

	    for(int i = n - 2; i >= 0; i--){

		   System.out.println("right[i + 1] : "+right[i + 1]+" a[i] : "+a[i]);

	       right[i] = Math.max(right[i + 1], a[i]);

	       System.out.println("right[i] : "+right[i]);
	    }

	    System.out.println("---------------------------");

        // Calculate the accumulated water element by element
	    // consider the amount of water on i'th bar, the
		// amount of water accumulated on this particular
	    // bar will be equal to min(left[i], right[i]) - arr[i] .

	    int water = 0;

	    for(int i = 1;i < n - 1;i++){

		    System.out.println("Math.min(left[i], right[i]) : "+Math.min(left[i], right[i]));
			System.out.println("a[i] : "+a[i]);

	        water += Math.max(0, Math.min(left[i], right[i]) - a[i]);

	        System.out.println("water : "+water);

	        System.out.println("_____________________");
	    }

        return water;
	}
}

public class TrappingRainWater{

	public static void main(String[] args){

		TestTrappingRainWater t = new TestTrappingRainWater();

		int[] a = {3, 0, 0, 2, 0, 4};

		//int[] a = {6, 6, 9};

		//int[] a = {7, 4, 0, 9};

		//int[] a = {8, 8, 2, 4, 5, 5, 1};

		//int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		//int[] a = {4, 3, 2, 1, 4};

		//int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

		//int[] a = {};

		//int[] a = {1,2};

		//int[] a = {1};

		int result = t.testTrappingRainWater(a);

		System.out.println(result);
	}
}




/*
	/*int n = arr.length - 1;
    int res = 0;

    System.out.println(Arrays.toString(arr)+"\n");

    // For every element of the array
    // except first and last element
    for(int i = 1; i < n - 1; i++){

        // Find maximum element on its left
        int left = arr[i];

        System.out.println("i : "+i+" | left : "+left);

        for(int j = 0; j < i; j++){

			System.out.println("-------------for-1--------------");

			System.out.println("j : "+j+" | left : "+left+" arr[j] : "+arr[j]);

            left = Math.max(left, arr[j]);

            System.out.println("left : "+left);

            System.out.println("-------------for-1--------------");
        }

        // Find maximum element on its right
        int right = arr[i];

        System.out.println("i : "+i+" | right : "+right);

        for(int j = i + 1; j < n; j++){

			System.out.println("-------------for-2--------------");

			System.out.println("j : "+j+" | right : "+right+" arr[j] : "+arr[j]);

            right = Math.max(right, arr[j]);

            System.out.println("right : "+right);

            System.out.println("-------------for-2--------------");
        }

        // Update maximum water value
        res += Math.min(left, right) - arr[i];

        //res += Math.min(left, right);

        System.out.println("res : "+res);
    }
    return res;*/