import java.util.*;

public class InsertionSort {
	static Node sorted;

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(8);
		Node node3 = new Node(5);
		Node node4 = new Node(12);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		Node newHead = insertionSort(head);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}
	}
	public static Node insertionSort(Node head) {
		sorted = null;
		Node current = head;
		// Traverse the given linked list and insert every
		// node to sorted
		while (current != null)
		{
			// Store next for next iteration
			Node next = current.next;
			// insert current in sorted linked list
			sortedInsert(current);
			// Update current
			current = next;
		}
		// Update head_ref to point to sorted linked list
        head = sorted;

        return head;
	}
	public static void sortedInsert(Node newnode) {
		/* Special case for the head end */
		if (sorted == null || sorted.data >= newnode.data) {
			newnode.next = sorted;
			sorted = newnode;
		}
		else {
			Node current = sorted;
			/* Locate the node before the point of insertion */
			while (current.next != null && current.next.data < newnode.data) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
		}
    }
}