import java.util.*;

public class PrintSubSequenceUsingRecursion {
	public static void main(String[] args) {
		String s = "abcd";
		String ans = "";

		ArrayList<String> list = new ArrayList<>();

		subsequence(s, ans, list);

		System.out.println(list);
	}

	public static void subsequence(String s, String ans, ArrayList<String> list) {
		if(s.length() == 0) {
			list.add(ans);
			return;
		}

		subsequence(s.substring(1), ans + s.charAt(0), list);

		subsequence(s.substring(1), ans, list);
	}
}