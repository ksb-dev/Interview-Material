import java.util.*;

public class StockSpanUsingStack {

	public static void main(String[] args) {
		int[] price = {100, 80, 60, 70, 60, 75, 85};
		//int[] price = {60, 70, 80, 100, 90, 75, 80, 120};
		//int[] price = {10, 10, 10, 10};
		int n = price.length;
		int[] s = new int[n];

		int[] res = stockSpan(price, n, s);

		System.out.println(Arrays.toString(res));
	}

	public static int[] stockSpan(int[] price, int n, int[] S) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		S[0] = 1;

		for (int i = 1; i < n; i++) {

			System.out.println("i : "+i);
			System.out.println("st.peek() :"+stack.peek());
			System.out.println("price[st.peek()] :"+price[stack.peek()]);
			System.out.println("price[i] :"+price[i]);

			while (!stack.empty() && price[stack.peek()] < price[i]) {
				/*System.out.println("st.peek() :"+stack.peek());
			    System.out.println("price[st.peek()] :"+price[stack.peek()]);
			    System.out.println("price[i] :"+price[i]);*/

				stack.pop();
			}

			S[i] = (stack.empty()) ? (i + 1) : (i - stack.peek());

            stack.push(i);

            System.out.println(Arrays.toString(S));
            System.out.println("stack : "+stack);
            System.out.println("------------");
		}
		return S;
	}
}