class MinimumStepsTo1 {
	public static int getMinStepsRec(int n) {
		if(n == 1) {
			return 0;
		}

		int op1 = getMinStepsRec(n - 1);
		int minSteps = op1;

		if(n % 3 == 0) {
			int op2 = getMinStepsRec(n / 3);

			if(op2 < minSteps) {
				minSteps = op2;
			}
		}

		if(n % 3 == 0) {
			int op3 = getMinStepsRec(n / 2);

			if(op3 < minSteps) {
				minSteps = op3;
			}
		}

		return 1 + minSteps;
	}

	public static int getMinStepsM(int n) {
		int[] storage = new int[n + 1];
		return getMinStepsM(n, storage);
	}

	public static int getMinStepsM(int n, int[] storage) {
		if(n == 0) {
			storage[n] = 0;
			return storage[n];
		}

		if(storage[n] != 0) {
			return storage[n];
		}

		int op1 = getMinStepsRec(n - 1);
		int minSteps = op1;

		if(n % 3 == 0) {
			int op2 = getMinStepsRec(n / 3);

			if(op2 < minSteps) {
				minSteps = op2;
			}
		}

		if(n % 3 == 0) {
			int op3 = getMinStepsRec(n / 2);

			if(op3 < minSteps) {
				minSteps = op3;
			}
		}
		return 1 + minSteps;
	}

    public static int getMinStepsDP(int n) {
        int[] dp = new int[n + 1];

        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            int min = dp[i - 1];
            //System.out.println("min : "+min);

            if (i % 2 == 0) {
                min = Math.min(min, dp[i/2]);
                //System.out.println("i/2: "+ i/2+", dp[i/2] : "+dp[i/2]);
                //System.out.println("i % 2 : "+min);
            }
            if (i % 3 == 0) {
                min = Math.min(min, dp[i/3]);
                //System.out.println("i/3 : "+ i/3 +", dp[i/3] : "+dp[i/3]);
                //System.out.println("i % 3 : "+min);
            }
            dp[i] = min + 1;

            //System.out.println("i : "+ i +", dp[i] : "+dp[i]);
            //System.out.println("------------");
        }

        return dp[n];
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 1000;
        //System.out.println(getMinStepsDP(n));
        System.out.println(getMinStepsM(n));
        System.out.println(getMinStepsRec(n));
    }
}