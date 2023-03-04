import java.util.*;

public class SkipMDeleteNnodes {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node newHead = skipMdeleteN(head, 1, 2);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node skipMdeleteN(Node head, int M, int N) {
		//Your code goes here
		Node curr = head, t;
		int count;

		if(M == 0) {
			return null;
		}

		// The main loop that traverses
		// through the whole list
		while (curr != null) {
			// Skip M nodes
			for (count = 1; count < M && curr != null; count++)
				curr = curr.next;

			// If we reached end of list, then return
			if (curr == null)
				return head;

			// Start from next node and delete N nodes
			t = curr.next;

			for (count = 1; count <= N && t != null; count++) {
				Node temp = t;
				t = t.next;
			}

			// Link the previous list with remaining nodes
			curr.next = t;

			// Set current pointer for next iteration
			curr = t;
		}
		return head;
	}
}