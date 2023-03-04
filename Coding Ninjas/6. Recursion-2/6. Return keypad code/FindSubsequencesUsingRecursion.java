import java.util.*;

public class FindSubsequencesUsingRecursion {

	public static void main(String[] args) {
		int n = 23;
		String[] res = keypad(n);

		System.out.println(Arrays.toString(res));
	}

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
        String output = "";
        String[] options = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> list = new ArrayList<>();

        ArrayList<String> result = getKeypad(n, output, options, list);

        String[] array = result.toArray(new String[0]);

        return array;
    }

    public static ArrayList<String> getKeypad(int n, String output, String[] options, ArrayList<String> list) {

        if(n == 0) {
			list.add(output);
        }

        int n1 = n % 10;
        String s1 = options[n1];

        for(int i = 0; i < s1.length(); i++) {
            getKeypad(n / 10, s1.substring(i , i + 1) + output, options, list);
        }
        return list;
    }
}