import java.util.*;

public class ReverseLinkedListKGroup {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		int k = 4;
		Node newHead = reverseKgroup(head, k);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node reverseKgroup(Node head, int k) {

		if(head == null || k == 1) return head;

		int length = getLength(head);

		Node dummy = new Node(0);
		dummy.next = head;

		Node current = dummy, previous = dummy, next = dummy;

		while(length >= k) {
			current = previous.next;
			next = current.next;

			for(int i = 1; i < k; i++) {
				current.next = next.next;
				next.next = previous.next;
				previous.next = next;
				next = current.next;
			}
			previous = current;
			length -= k;
		}
		return dummy.next;
	}

	public static int getLength(Node head) {
		int length = 0;

		while(head != null) {
			length++;
			head = head.next;
		}
		return length;
	}
}