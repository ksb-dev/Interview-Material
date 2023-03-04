class TestMaxSubArraySum{

	public int maxSubArraySum(int[] a){

		/*int max_current = 0;
		int max_global = 0;

	    for(int i = 0; i < a.length; i++){

			max_current = max_current + a[i];

			if(max_current < 0){

				max_current = 0;
			}

			if(max_global < max_current){

				max_global = max_current;
			}
		}*/

		int max_current = a[0];
		int max_global = a[0];

		for(int i = 1; i < a.length; i++){

		    max_current = Math.max(a[i], max_current + a[i]);
		    max_global = Math.max(max_global, max_current);
        }
		return max_global;
	}
}

public class MaxSubArraySum{

	public static void main(String[] args){

		TestMaxSubArraySum t = new TestMaxSubArraySum();

		int[] a = {-2,-1};

		//int[] a = {-1,-2,-3,-4};

		int result = t.maxSubArraySum(a);

		System.out.println(result);
	}
}

/*

{1,2,3,-2,5}

max_current = 0, 1, (1 + 2)3, (3 + 3) 6, (6 -2) 4, (4 + 5) 9

max_global = 0, 1, 3, 6, 9

*/