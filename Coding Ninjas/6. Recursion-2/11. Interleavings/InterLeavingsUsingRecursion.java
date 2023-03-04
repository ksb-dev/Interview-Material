public class InterLeavingsUsingRecursion {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "def";

	    interleavings(s1, s2);
	}

	public static void interleavings(String first, String second){

        int i = 0;
        int j = 0;
        String asf = "";

		printInterLeaving(first, i, second, j, asf);
	}
    static void printInterLeaving(String s1, int i, String s2, int j, String asf) {

        if (i == s1.length() && j == s2.length()) {
            System.out.println(asf);
        }

        // Either we will start with string 1
        if (i < s1.length())
            printInterLeaving(s1, i + 1, s2, j, asf + s1.charAt(i));
        // Or with string 2
        if (j < s2.length())
            printInterLeaving(s1, i, s2, j + 1, asf + s2.charAt(j));
    }
}