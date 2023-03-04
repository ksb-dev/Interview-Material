public class RemoveConsecutiveDuplicatesUsingRecursion {
	public static void main(String[] args) {
		String s = "aabccba";

		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {

		if(s.length() <= 1) {
			return s;
		}

		if(s.charAt(0) == s.charAt(1)) {
			return removeDuplicates(s.substring(1));
		}
		else {
	        return s.charAt(0) + removeDuplicates(s.substring(1));
		}
	}
}