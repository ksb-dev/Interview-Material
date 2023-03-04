public class CheckPalindromeUsingRecursion {

	public static void main(String[] args) {
		String s = "abbaa";

		System.out.println(isStringPalindrome(s));
	}

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        //int mid = input.length() / 2;

        boolean result = isPalindrome(0, input.length() - 1, input);


        return result;
	}

    public static boolean isPalindrome(int start, int end, String s) {

        if(start == end) {
            return true;
        }
        if ((s.charAt(start)) != (s.charAt(end)))
            return false;

        if(start <= end) {
            return isPalindrome(start + 1, end - 1, s);
        }
        return true;
    }
}