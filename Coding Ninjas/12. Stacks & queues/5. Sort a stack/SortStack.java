import java.util.*;

public class SortStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Before sorting stack : "+stack);
		sortStack(stack);
	}

	public static void sortStack(Stack<Integer> stack) {

		Stack<Integer> tempStack = new Stack<Integer>();

		while(!stack.isEmpty()) {
			// pop out the first element

			int top = stack.pop();

			// while temporary stack is not empty and
			// top of stack is greater than temp

			while(!tempStack.isEmpty() && tempStack.peek() < top) {

				// pop from temporary stack and
				// push it to the input stack
			    stack.push(tempStack.pop());
			}

			// push temp in temporary of stack

			tempStack.push(top);
		}
		System.out.println("After sorting stack : "+tempStack);

		Iterator value = tempStack.iterator();

		while (value.hasNext()) {
			System.out.print(value.next()+" ");
        }
    }

	/*public static void sortStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int top = stack.pop();

		//System.out.println(top);

		sortStack(stack);

		//System.out.println();

		//System.out.println(stack);
		//System.out.println("------------------");

		sortedInsert(stack, top);
    }

    public static void sortedInsert(Stack<Integer> stack, int key) {
		System.out.println(stack);
		System.out.println("key : "+key);

		if (stack.isEmpty() || key < stack.peek()) {
			System.out.println("stack.isEmpty() : "+stack.isEmpty());
			//System.out.println(key < stack.peek());
			stack.push(key);
			return;
		}
		System.out.println("key < stack.peek()  "+(key < stack.peek()));
		System.out.println("stack.peek() : "+stack.peek());

		int top = stack.pop();

		System.out.println("top : "+top);

		sortedInsert(stack, key);

		stack.push(top);

		//System.out.println(stack);
		System.out.println("------------------");
    }*/
}