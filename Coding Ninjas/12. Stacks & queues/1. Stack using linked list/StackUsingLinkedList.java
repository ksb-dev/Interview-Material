import java.util.*;

public class StackUsingLinkedList {

	static Node top;

	public StackUsingLinkedList() {
		//Implement the Constructor
		this.top = null;
    }

    public static int getSize() {
		//Implement the getSize() function
		int length = 0;
		Node current = top;

		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public static boolean isEmpty() {
		//Implement the isEmpty() function
		return top == null;
	}

	public static Node push(int element) {
		//Implement the push(element) function
		Node temp = new Node(0);

		// check if stack (heap) is full. Then inserting an
		//  element would lead to stack overflow
		if (temp == null) {
			return temp;
		}

		// initialize data into temp data field
		temp.data = element;

		// put top reference into temp link
		temp.next = top;

		// update top reference
		top = temp;

		return top;
	}

	public static int pop() {
		//Implement the pop() function
		if (top == null) {
			return -1;
		}
		// update the top pointer to point to the next node
		int element = top.data;
		top = (top).next;

		return element;
	}

	public static int top() {
		//Implement the top() function
		if (!isEmpty()) {
			return top.data;
		}
		return -1;
    }

	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		Node newHead = push(50);

		int res = pop();
		int size = getSize();

		int top = top();

		//Node newHead = insertionSort(head);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}

		System.out.println();

		System.out.println("Popped element is : "+res+"\n");
		System.out.println("Size of the stack is : "+size+"\n");
		System.out.println("Top element of the stack is : "+top+"\n");
	}
}