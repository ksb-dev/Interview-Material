import java.util.*;

public class PrintArrayAfterKOperations {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(20);
		arr.add(15);
		arr.add(10);
		arr.add(5);

		int k  = 2;
		int n = arr.size();

		if (k == 0) {
		    System.out.println(arr);
	    }

		ArrayList<Integer> soln = new ArrayList<>();
		// Finding maxm element value in Arr[].
		int maxm = Collections.max(arr);
		// Finding minm element value in Arr[].
		int minm = Collections.min(arr);

		// If K is odd, then all array will be transformed to maxm - Arr[i].
		if ((k % 2 != 0)) {
			for (int i = 0; i < n; i++) {
				soln.add(maxm - arr.get(i));
			}

			System.out.println(soln);
		}

		// Else if K is even, then all array will be transformed to minm - Arr[i].
		else {
			for (int i = 0; i < n; i++) {
				soln.add(arr.get(i) - minm);
		    }
			System.out.println(soln);
		}
	}
}