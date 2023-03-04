public class ConvertToAnyBase {
	public static void main(String[] args) {

		int dividend = 634;
		int base = 8;
		int result = 0;
		int power = 1;

		while(dividend > 0) {
			int remainder = dividend % base;
			System.out.println("remainder :"+remainder);
			dividend = dividend / base;
			System.out.println("dividend :"+dividend);

			result += remainder * power;
			System.out.println("result :"+result);
			power = power * 10;
			System.out.println("power :"+power);

			System.out.println("---------------");
		}
		System.out.println(result);
	}
}