import java.util.*;

public class AddOneToLinkedList {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(9);
		Node node2 = new Node(9);
		Node node3 = new Node(9);
		Node node4 = new Node(9);
		Node node5 = new Node(9);
		Node node6 = new Node(9);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		Node newHead = addOne(head);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node addOne(Node head) {
		// To store the last node in the linked
		// list which is not equal to 9
		Node last = null;
		Node cur = head;

		// Iterate till the last node
		while (cur.next != null) {
			if (cur.data != 9) {
				last = cur;
			}
			cur = cur.next;
		}

		// If last node is not equal to 9
		// add 1 to it and return the head
		if (cur.data != 9) {
			cur.data++;
			return head;
		}

		// If list is of the type 9 . 9 . 9 ...
		if (last == null) {
			last = new Node(0);
			last.data = 0;
			last.next = head;
			head = last;
		}

		// For cases when the rightmost node which
		// is not equal to 9 is not the last
		// node in the linked list
		last.data++;
		last = last.next;

		while (last != null) {
			last.data = 0;
			last = last.next;
		}
        return head;
	}
}