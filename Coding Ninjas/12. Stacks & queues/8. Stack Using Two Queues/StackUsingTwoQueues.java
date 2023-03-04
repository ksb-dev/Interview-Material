import java.util.*;

public class StackUsingTwoQueues {
	 //Define the data members
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();

	// To maintain current number of
	// elements
	static int curr_size;


	public StackUsingTwoQueues() {
		//Implement the Constructor
		curr_size = 0;
	}

	public static int getSize() {
		//Implement the getSize() function
		return curr_size;
	}

	public static boolean isEmpty() {
		//Implement the isEmpty() function
		if(curr_size == 0) return true;

		return false;

	}

	public static void push(int element) {
		//Implement the push(element) function
		curr_size++;

		// Push x first in empty q2
		q2.add(element);

		// Push all the remaining
		// elements in q1 to q2.
		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}

		// swap the names of two queues
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	public static int pop() {
		//Implement the pop() function
		// if no elements are there in q1
		if (q1.isEmpty())
			return -1;
		int element = q1.remove();
		curr_size--;
		return element;
	}

	public static int top() {
		//Implement the top() function
		if (q1.isEmpty())
			return -1;
		return q1.peek();
    }
	public static void main(String[] args) {
		StackUsingTwoQueues s = new StackUsingTwoQueues();
		s.push(1);
		s.push(1);
		s.push(1);
		s.push(1);
		System.out.println(s.getSize());
	}
}