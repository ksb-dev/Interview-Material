//Count all sub-arrays having sum divisible by k

public class SubArrayDivisibleByK {
	public static void main(String[] args){
		//int[] a1 = {5, 0, 2, 3, 1}; // k = 5, output = 6
		//int[] a2 = {2, 3, 1};       // k = 2, output = 3
		int[] a3 = {1, 2, 3, 4};    // k = 1, output = 10
		//int[] a4 = {4, 5, 0, -2, -3, 1};

		B b = new B();
		//int result = b.m(a1, 5);
		//int result = b.m(a2, 2);
		int result = b.m(a3, 1);
		//int result = b.m(a4, 5);

		System.out.println(result);
	}
}

class B {
	public int m(int[] arr, int k) {
		 int count = 0;

		    for (int i = 0; i < arr.length; i++) {

		      // To store sum of subarray, starting indices are 'i'.
		      int curSum = 0;

		      // Check all subarray that can have sum divisible by 'k'.
		      for (int j = i; j < arr.length; j++) {
		        curSum = curSum + arr[j];
		        if (curSum % k == 0) {
		          count += 1;
		        }
		      }
		    }

    return count;
	}
}