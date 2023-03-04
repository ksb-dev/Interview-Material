class MinimumCountOfSquares {

	public static void main(String args[]) {
		int n = 5;
		System.out.println(getMinSquaresDP(n));
	    //System.out.println(getMinSquaresRec(n));
    }

    /*public static int getMinSquaresRec(int n) {

        if (n <= 3)
            return n;

        int res = n;

        for (int x = 1; x <= n; x++) {
            int temp = x * x;

            if (temp > n)
                break;
            else
                res = Math.min(res, 1 + getMinSquaresRec(n - temp));
        }
        return res;
    }*/

    public static int getMinSquaresDP(int n) {

		int dp[] = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {

			int min = Integer.MAX_VALUE;

			for (int j = 1; j * j <= i; j++) {

				int rem = i - j* j;

				if(dp[rem] < min) {
					min = dp[rem];
				}
			}
			dp[i] = min + 1;
		}

		return dp[n];
	}
}