public class QueueUsingLinkedList {

	static Node front, rear;
	static int count = 0;

	public QueueUsingLinkedList() {
		//Implement the Constructor
		this.front = this.rear = null;
	}

	public static int getSize() {
		//Implement the getSize() function
		return count;
	}


	public static boolean isEmpty() {
		//Implement the isEmpty() function
		return rear == null && front == null;
	}


	public static Node push(int data) {
		//Implement the enqueue(element) function
		Node node = new Node(data);

		// special case: queue was empty
		if (front == null) {
			// initialize both front and rear
			front = node;
			rear = node;
		}
		else {
			// update rear
			rear.next = node;
			rear = node;
		}

		// increase the node's count by 1
		count += 1;
		return front;
	}


	public static int pop() {
		//Implement the dequeue() function
		if (front == null) return -1;

		Node temp = front;

		// advance front to the next node
		front = front.next;

		// if the list becomes empty
		if (front == null) {
			rear = null;
		}

		// decrease the node's count by 1
		count -= 1;

		// return the removed item
		return temp.data;
	}


	public static int front() {
		//Implement the front() function
		if (front == null) return -1;

		return front.data;
    }
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		Node newHead = push(50);

		int res = pop();
		int size = getSize();

		int front = front();

		//Node newHead = insertionSort(head);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}

		System.out.println();

		System.out.println("Popped element is : "+res+"\n");
		System.out.println("Size of the queue is : "+size+"\n");
		System.out.println("Front element of the queue is : "+front+"\n");
	}
}