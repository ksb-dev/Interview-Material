public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "MalayAlam";

		boolean result = isPalindrome(s);

		System.out.println(result);

	}

	public static boolean isPalindrome(String str) {
		//Your code goes here
		String s = str.trim().toLowerCase();

		char[] c = s.toCharArray();
		int length = c.length -1;

		for(int i = 0; i < ((c.length)/2); i++) {

			if(c[i] == c[length]) {

				length--;
			}
			else {

				return false;
			}
		}
        return true;
	}
}