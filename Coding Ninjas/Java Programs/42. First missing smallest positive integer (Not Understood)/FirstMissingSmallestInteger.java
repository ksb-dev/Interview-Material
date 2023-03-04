import java.util.*;

class TestFirstMissingSmallestInteger{

	//public int testFirstMissingSmallestInteger(int[] a){

		public int testFirstMissingSmallestInteger(int[] A) {
		        int n = A.length;

		    	for (int i = 0; i < n; i++) {
		    		while (A[i] != i + 1) {
		    			if (A[i] <= 0 || A[i] >= n)
		    				break;

		                	if(A[i]==A[A[i]-1])
		                    		break;

		    			int temp = A[i];
		    			A[i] = A[temp - 1];
		    			A[temp - 1] = temp;
		    		}
		    	}

		    	for (int i = 0; i < n; i++){
		    		if (A[i] != i + 1){
		    			return i + 1;
		    		}
		    	}

		    	return n + 1;
}
	//}
}

public class FirstMissingSmallestInteger{

	public static void main(String[] args){

		TestFirstMissingSmallestInteger t = new TestFirstMissingSmallestInteger();

		//int[] a = {7, 8, 9, 11, 12};

		//int[] a = {1,2,0};

		int[] a = {2, 3, -7, 6, 8, 1, -10, 15};

		//int[] a = {1, 1, 0, -1, -2};

		//int[] a = {2, 3, 7, 6, 8, -1, -10, 15};

		int result = t.testFirstMissingSmallestInteger(a);

		System.out.println("Final Result : "+result);
	}
}


/*public class FirstMissingSmallestInteger {

    static int solution(int[] A)
    {
        int n = A.length;

        // To mark the occurrence of elements
        boolean[] present = new boolean[n + 1];

        // Mark the occurrences
        for (int i = 0; i < n; i++) {

            // Only mark the required elements
            // All non-positive elements and
            // the elements greater n + 1 will never
            // be the answer
            // For example, the array will be {1, 2, 3}
            // in the worst case and the result
            // will be 4 which is n + 1
            if (A[i] > 0 && A[i] <= n) // 2, 3, -7, 6, 8, 1, -10, 15
                present[A[i]] = true;
        }

        // Find the first element which didn't
        // appear in the original array
        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;

        // If the original array was of the
        // type {1, 2, 3} in its sorted form
        return n + 1;
    }

    // Driver Code
    public static void main(String[] args)
    {

        //int A[] = { 0, 10, 2, -10, -20 };

        //int[] A = {1,2,0};

        //int[] A = {2, 3, 7, 6, 8, -1, -10, 15};

        int[] A = {2, 3, -7, 6, 8, 1, -10, 15};
        System.out.println(solution(A));
    }
}*/