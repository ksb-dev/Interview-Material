public class MultiplicationOfTwoIntegersUsingRecursion {

	public static void main(String[] args) {
		int a = 2, b = 3;

		System.out.println(multiplication(a, b));
	}

	public static int multiplication(int x, int y) {
		if (x < y)
			return  multiplication(y, x);

		// iteratively calculate
		// y times sum of x
		else if (y != 0)
			return (x +  multiplication(x, y - 1));

		// if any of the two numbers is
		// zero return zero
		else
            return 0;
	}
}