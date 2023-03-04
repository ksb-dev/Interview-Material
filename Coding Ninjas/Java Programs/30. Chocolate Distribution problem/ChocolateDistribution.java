import java.util.*;

class TestChocolateDistribution{

    public int findMinimumDifference(int a[], int students){

        if (students == 0 || a.length == 0){

			return 0;
		}

        Arrays.sort(a);

        //System.out.println(Arrays.toString(a));

        if (a.length < students){

			return -1;
		}

        int minimum_difference = Integer.MAX_VALUE;

        for (int i = 0; (i + students - 1) < a.length; i++)
        {
            int difference = a[i + students -1] - a[i];

            //System.out.println("m : :"+m);

            //System.out.println("arr[i+m-1] : "+arr[i+m-1]+" arr[i] : "+arr[i]);

           // System.out.println("diff : "+diff);

            if (difference < minimum_difference){

				minimum_difference = difference;

				//System.out.println("min_diff : "+min_diff);
			}
        }
        return minimum_difference;
    }
}

public class ChocolateDistribution{

	public static void main(String[] args){

		TestChocolateDistribution t = new TestChocolateDistribution();

		int[] a = {3, 4, 1, 9, 56, 7, 9, 12};

		int students = 7;

		int result = t.findMinimumDifference(a, students);

		System.out.println(result);
	}
}