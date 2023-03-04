public class GeometricSumUsingRecursion {
	public static void main(String[] args) {
		int k = 3;

		System.out.println(findGeometricSum(k));
	}

	public static double findGeometricSum(int k){
		// Write your code here
        /*if(k == 0) {
			return 1;
		}
	    return 1 + 0.5 * (findGeometricSum(k - 1));*/

	    /*if (k == 0)
			return 1;

		// calculate the sum each time
		double ans = 1 / (double)Math.pow(2, k) + findGeometricSum(k - 1);

		// return final answer
        return ans;*/
	}
}