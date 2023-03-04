import java.util.*;

class TestMinimiseHeights{

    public int minimiseHeights(int a[], int k){

        if (a.length == 1){

			return 0;
	    }

        Arrays.sort(a);

        int ans = a[a.length - 1] - a[0];

        int small = a[0] + k;
        int big = a[a.length - 1] - k;
        int temp = 0;

        if (small > big){

            temp = small;
            small = big;
            big = temp;
        }

        for (int i = 1; i < a.length - 1; i ++){

            int subtract = a[i] - k;
            int add = a[i] + k;

            if (subtract >= small || add <= big){

				continue;
			}

            if (big - subtract <= add - small){

				small = subtract;

			}

            else{

				big = add;
			}

        }

        return Math.min(ans, big - small);
    }

}

public class MinimiseHeights{

	public static void main(String[] args){

		TestMinimiseHeights t = new TestMinimiseHeights();

	    //int a[] = {1, 5, 8, 10};

	    int[] a = {6, 1, 9, 1, 1, 7, 9, 5, 2, 10};

	    int k = 2;

	    int result = t.minimiseHeights(a, k);

	    System.out.println(result);
    }
}