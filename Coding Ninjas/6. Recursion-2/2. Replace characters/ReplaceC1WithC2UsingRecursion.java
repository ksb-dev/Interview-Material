public class ReplaceC1WithC2UsingRecursion {

	public static void main(String[] args) {

		String s = "abaca";
		char c1 = 'a';
		char c2 = 'x';

		String result = replaceChar(s, c1, c2);

		System.out.println(result);
	}

	public static String replaceChar(String s, char c1, char c2) {

		if(s.length() == 0) {
			return s;
		}

		char ans = s.charAt(0);

	    if(s.charAt(0) == c1) {
			ans = c2;

			s = c2 + s.substring(1);
		}
		return ans + replaceChar(s.substring(1), c1, c2);
	}
}