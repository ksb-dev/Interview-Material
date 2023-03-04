public class SumOfDigitsUsingRecursion {

	public static void main(String[] args) {
		int a = 12345;

		System.out.println(sumOfDigits(a));
	}

	public static int sumOfDigits(int a) {

		if (a < 10) {
			return a;
		}

		return (a % 10) + sumOfDigits(a / 10);
	}
}