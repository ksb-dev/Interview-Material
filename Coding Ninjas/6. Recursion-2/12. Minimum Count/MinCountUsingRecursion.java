/*
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.

12 can be represented as :
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
2^2 + 2^2 + 2^2 = 3
*/

public class MinCountUsingRecursion {

	public static void main(String[] args) {
		int n = 6;

		System.out.println(minCount(n));
	}

	public static int minCount(int n){

		if (n <= 3)
            return n;

        int res = n;

        for (int x = 1; x <= n; x++) {

            int temp = x * x;

            if (temp > n)
                break;
            else
                res = Math.min(res, 1 + minCount(n - temp));
        }
        return res;
	}
}