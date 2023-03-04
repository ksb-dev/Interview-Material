import java.util.*;

public class PalidromePartitioningOfAString {
	public static void main(String[] args) {
		String s = "geeks";
		List<List<String>> result = new ArrayList<>();
		List<String> path = new ArrayList<>();

		System.out.println(check(0, s, result, path ));
	}

	public static List<List<String>> check(int index, String s, List<List<String>> result, List<String> path) {
		if(index == s.length()) {
			result.add(new ArrayList<>(path));
			return result;
		}

		for(int i = index; i < s.length(); i++) {

			if(isPalindrome(s, index, i)) {
				path.add(s.substring(index, i + 1));

				check(i + 1, s, result, path);

				path.remove(path.size() - 1);
			}
		}
		return result;
	}

	public static boolean isPalindrome(String s, int start, int end) {
		while(start <= end) {
			if(s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}
}