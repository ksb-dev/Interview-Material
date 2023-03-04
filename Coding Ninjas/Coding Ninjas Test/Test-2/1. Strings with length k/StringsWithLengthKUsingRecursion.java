import java.util.*;

public class StringsWithLengthKUsingRecursion {

	public static void main(String[] args) {
		String s = "abc";
		int len = 2;

		System.out.println(Arrays.toString(allStrings(s, len)));
	}

	public static String[] allStrings(String charSet, int len){

		// Write your code here
        char[] set = charSet.toCharArray();

        ArrayList<String> list = new ArrayList<>();

		ArrayList<String> result = printAllKLength(set, len, list);

		String[] array = result.toArray(new String[0]);

        return array;

	}

    static ArrayList<String> printAllKLength(char[] set, int k, ArrayList<String> list) {
        int n = set.length;
        return printAllKLengthString(set, "", n, k, list);
    }

    static ArrayList<String> printAllKLengthString(char[] set, String prefix, int n, int k, ArrayList<String> list) {

    // Base case: k is 0,
    // print prefix
        if (k == 0) {
            //System.out.println(prefix);
            //return;
            list.add(prefix);
            return list;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthString(set, newPrefix, n, k - 1, list);
        }
        return list;
    }
}