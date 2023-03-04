public class CheckNumberIsPalindromeUsingRecursion {
	public static void main(String[] args) {
		int n = 121;
		int sum = 0;

		int result = checkPalindrome(n, sum);

		if(result == n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static int checkPalindrome(int n, int sum) {
		if(n == 0) {
			return sum;
		}

		sum = (sum * 10) + (n % 10);

		System.out.println("sum :"+sum);
		System.out.println(n / 10);

		return checkPalindrome(n / 10, sum);
	}
}