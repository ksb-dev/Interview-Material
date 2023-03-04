import java.util.*;

public class FirstNonRepeatingCharacter {

	static char res;

	public static char optimal(String s) {
		char[] c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < c.length; i++) {
			map.put(c[i], map.getOrDefault(c[i], 0) + 1);
		}

		for(int i = 0; i < c.length; i++) {
			int freq = map.get(c[i]);

			if(freq == 1) {
				return c[i];
			}
		}

		System.out.println(map);

		return res;
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";

		System.out.println(optimal(s));
	}
}