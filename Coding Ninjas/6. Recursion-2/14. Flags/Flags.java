/*

A flag can consists of only three different colors of stripes, White(W), Blue(B) and Red(R).
Given an integer N, find and return the number of ways to create such flags having N stripes
consisting of these three color stripes only with the following constraints

1. Stripes of the same color cannot be placed next to each other.
2. A blue stripe must always be placed between a white and a red or between a red and a white one. Hence blue stripe cannot be placed at starting or at ending.
3. Its not necessary to use all three colors.

*/

public class Flags {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(find_Ways(n));
	}

	public static long find_Ways(int N) {
		if(N == 1 || N == 2) return 2;

		long ans = find_Ways(N - 1) + find_Ways(N - 2);

        return ans;
	}
}