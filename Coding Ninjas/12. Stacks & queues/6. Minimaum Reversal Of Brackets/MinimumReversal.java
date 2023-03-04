// 1. Create a auxillary stack and iterate through the string
// 2. If we get a '}' & top is not '{' push
// 3. If we get a '}' & top is '{' pop
// 4. Else push '{'
// 5. m = reduced stack size n = count of opening brackets
// 6. return (m/2)+(n%2)

import java.util.*;

public class MinimumReversal {
	public static void main(String[] args) {
		//String s = "{{{{}}";
		//String s = "}{";
		//String s = "{}";
		//String s = "{}}";
		String s = "}{{}}{{{";

		System.out.println(minimumReversal(s));
	}
	public static int minimumReversal(String s) {
		int length = s.length();

		// length of expression must be even to make
		// it balanced by using reversals.
		if (length % 2 != 0) return -1;

		// After this loop, stack contains unbalanced
		// part of expression, i.e., expression of the
		// form "}}..}{{..{"
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < length; i++) {

			char c = s.charAt(i);

			if (c =='}' && !stack.empty()) {

				if (stack.peek() == '{')
					stack.pop();
				else
					stack.push(c);
			}
			else
				stack.push(c);

			System.out.println(stack);
		}

		// Length of the reduced expression
		// red_len = (m+n)
		int m = stack.size();

		System.out.println(m);

		// count opening brackets at the end of
		// stack
		int n = 0;

		while (!stack.empty() && stack.peek() == '{') {
			stack.pop();
			n++;
		}

		System.out.println(n);

		// return ceil(m/2) + ceil(n/2) which is
		// actually equal to (m+n)/2 + n%2 when
		// m+n is even.
        return ((m / 2) + (n % 2));
	}
}