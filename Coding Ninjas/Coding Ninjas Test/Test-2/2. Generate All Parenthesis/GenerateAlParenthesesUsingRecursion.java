public class GenerateAlParenthesesUsingRecursion {

	public static void main(String[] args) {
		printWellFormedParanthesis(3);
	}

	public static void printWellFormedParanthesis( int n){

		// Write your code here
        char[] str = new char[2 * n];
        printParenthesis(str, n);
	}

    static void printParenthesis(char str[], int n) {
        if(n > 0)
        _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    static void _printParenthesis(char str[], int pos, int n, int open, int close) {

        if(close == n) {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else {

            if(open > close) {
                str[pos] = ')';
                _printParenthesis(str, pos+1, n, open, close+1);
            }

            if(open < n) {
                str[pos] = '(';
                _printParenthesis(str, pos+1, n, open+1, close);
            }
        }
    }
}