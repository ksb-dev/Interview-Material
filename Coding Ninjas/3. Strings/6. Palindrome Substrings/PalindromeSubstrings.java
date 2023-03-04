public class PalindromeSubstrings {

	public static void main(String[] args) {
		String s = "aba";

		int result = countPalindromeSubstrings(s);

		System.out.println(result);
	}

	public static int countPalindromeSubstrings(String s) {
		// Write your code here
        if(s.length() == 0) return 0;

        int n = s.length();
        boolean[][] b = new boolean[n][n];
        int result = 0;

        for(int i = 0; i < n; i++) {
            b[i][i] = true;
            result++;
        }

        for(int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                b[i][i+1] = true;
                result++;
            }
        }

        for(int length = 3; length <= n; length++) {
            for(int i = 0, j = i + length -1; j < n; i++, j++) {
                if(s.charAt(i) == s.charAt(j) && b[i+1][j-1]) {
                    b[i][j] = true;
                    result++;
                }
            }
        }

        return result;
	}
}