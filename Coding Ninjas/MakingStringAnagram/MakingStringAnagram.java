import java.util.Arrays;

public class MakingStringAnagram {
	public static void main(String[] args) {
		String str1 = "cde";
		String str2 = "abc";

		int count1[] = new int[26];
		int count2[] = new int[26];

		System.out.println('c'-'a');
		System.out.println('d'-'a');
		System.out.println('e'-'a');

		// count frequency of each character
		// in first string
		for (int i = 0; i < str1.length() ; i++) {
			count1[str1.charAt(i) -'a']++;
			System.out.println(i+" "+count1[str1.charAt(i) -'a']);
		}
		System.out.println("1---------------");

		// count frequency of each character
		// in second string
		for (int i = 0; i < str2.length() ; i++) {
			count2[str2.charAt(i) -'a']++;
			System.out.println(i+" "+count1[str1.charAt(i) -'a']);
		}
		System.out.println("2---------------");
		System.out.println(Arrays.toString(count1));
		System.out.println(Arrays.toString(count2));

		// traverse count arrays to find
		// number of characters to be removed
		int result = 0;

		for (int i = 0; i < 26; i++) {
			result += Math.abs(count1[i] - count2[i]);
			System.out.println(result);
		}
	}
}