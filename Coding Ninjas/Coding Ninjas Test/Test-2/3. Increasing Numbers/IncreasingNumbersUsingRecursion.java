public class IncreasingNumbersUsingRecursion {

	public static void main(String[] args) {
		printIncreasingNumber(2);
	}

	public static void printIncreasingNumber(int n) {
		/* Your class should be named Solution.
		 * Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        findStrictlyIncreasingNum(1, "", n);
	}

    public static void findStrictlyIncreasingNum(int start, String out, int n) {
        // If number becomes N-digit, print it
        if (n == 0)
        {
            System.out.print(out + " ");
            return;
        }

        // start from (prev digit + 1) till 9
        for (int i = start; i <= 9; i++)
        {
            // append current digit to number
            String str = out + Integer.toString(i);

            // recurse for next digit
            findStrictlyIncreasingNum(i + 1, str, n - 1);
        }
    }
}