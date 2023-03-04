import java.util.HashMap;

public class SmallestWindowInaStringContainingAllCharactersOfAnotherString {
    public static String smallestWindow(String s1, String s2) {
		String ans = "";
		HashMap<Character, Integer> map2 = new HashMap<>();
		char[] c = s2.toCharArray();

		for(int i = 0; i < c.length; i++) {
			map2.put(c[i], map2.getOrDefault(c[i], 0) + 1);

			// OR

			/*if(map2.containsKey(c[i])) {
				int freq = map2.get(c[i]);
				map2.put(c[i], map2.get(c[i]) + 1);
			}
			else {
				map2.put(c[i], 1);
			}*/
		}
		return ans;
    }

    public static void main(String[] args) {
		String s1 = "timetopractice";
        String s2 = "toc";

        System.out.println(smallestWindow(s1, s2));
	}
}