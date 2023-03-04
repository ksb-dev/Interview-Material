public class RemoveXFromStringUsingRecursion {
	public static void main(String[] args) {
		//String s = "xaxbcxdx";
		String s = "xxx";

		String result = removeX(s);

		System.out.println(result);
	}

	public static String removeX(String s) {
		if(s.length() == 0) {
			return s;
		}

		String ans = "";

		if(s.charAt(0) != 'x') {
			ans += s.charAt(0);
		}

		return ans + removeX(s.substring(1));
	}
}