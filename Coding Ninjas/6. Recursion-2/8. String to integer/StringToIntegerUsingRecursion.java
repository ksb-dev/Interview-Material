public class StringToIntegerUsingRecursion {
	public static void main(String[] args) {
		String s = "00145";

		System.out.println(convertStringToInt(s));
	}

	public static int convertStringToInt(String s){

		int length = s.length() - 1;
		char[] c = s.toCharArray();

		return StringToInteger(c, length);
	}

	public static int StringToInteger(char[] c, int last) {
		if(last == 0) {
			return c[last] - '0';
		}

		int ans = StringToInteger(c, last - 1);

		int a = c[last] - '0';

		return ans * 10 + a;
    }
}