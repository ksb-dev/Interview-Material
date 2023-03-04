import java.util.*;

public class NextGreaterElementType2 {

	public static int[] replaceNextGreaterElement(int[] arr) {
		int length = arr.length;
		int[] result = new int[length];

		Stack<Integer> stack = new Stack<>();

		  for(int i = (2 * length) - 1; i >= 0; i--) {

			 while(!stack.empty()) {
					if(arr[i % length] < stack.peek()) break;
					stack.pop();
			 }

			 if(stack.empty()) result[i % length]= -1;

			 else result[i % length] = stack.peek();

			 stack.push(arr[i % length]);
		  }

      return result;
	}
	public static void main(String[] args) {
		//int[] arr = {1, 2 ,1};
		int[] arr = {1, 2, 3, 4, 3};
		int[] result = replaceNextGreaterElement(arr);

		System.out.println(Arrays.toString(result));
	}
}