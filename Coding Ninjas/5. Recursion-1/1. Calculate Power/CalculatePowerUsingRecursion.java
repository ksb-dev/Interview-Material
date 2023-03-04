public class CalculatePowerUsingRecursion {

	public static void main(String[] args) {
		int x = 2;
		int n = 3;

		System.out.println(power(x, n));
	}

	public static int power(int x, int n) {

        if(n == 0) {
            return 1;
        }

        int result = x * power (x , (n - 1));

        return result;
	}
}