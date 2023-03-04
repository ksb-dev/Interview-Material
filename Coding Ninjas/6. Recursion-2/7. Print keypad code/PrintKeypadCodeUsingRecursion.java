import java.util.*;

public class PrintKeypadCodeUsingRecursion {

	public static void main(String[] args) {
		int n = 23;
		keypad(n);
	}

	// Return a string array that contains all the possible strings
	public static void keypad(int n){
		// Write your code here
        String output = "";
        String[] options = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        getKeypad(n, output, options);
    }

    public static void getKeypad(int n, String output, String[] options) {

        if(n == 0) {
			System.out.println(output);
        }

        int n1 = n % 10;
        String s1 = options[n1];

        for(int i = 0; i < s1.length(); i++) {
            getKeypad(n / 10, s1.substring(i , i + 1) + output, options);
        }
    }
}