import java.util.*;

public class ReverseFirstKElementsFromQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(10);
		queue.add(15);
		queue.add(2);
		queue.add(6);

		int k = 4;

		Queue<Integer> res = removeK(queue, k);

		System.out.println(res);
	}
	public static Queue<Integer> removeK(Queue<Integer> queue, int k) {
		if (queue.isEmpty() == true || k > queue.size())
		            return queue;
		if (k <= 0)
			return queue;

		Stack<Integer> stack = new Stack<Integer>();

		// Push the first K elements into a Stack
		for (int i = 0; i < k; i++) {
			stack.push(queue.peek());
			queue.remove();
		}

		// Enqueue the contents of stack
		// at the back of the queue
		while (!stack.empty()) {
			queue.add(stack.peek());
			stack.pop();
		}

		// Remove the remaining elements and enqueue
		// them at the end of the Queue
		for (int i = 0; i < queue.size() - k; i++) {
			queue.add(queue.peek());
			queue.remove();
		}
        return queue;
	}
}