import java.util.*;

public class SplitLinkedListIntoAlternativeHalves {
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

		splitIntoHalves(head);
	}

	public static void splitIntoHalves(Node head) {
		if(head == null || head.next == null)  {
			System.out.print(head.data);
			return;
        }

		Node firstHead = head;
		Node firstTail = head;
		Node secondHead = head.next;
		Node secondTail = head.next;
		head = head.next.next;

		while(head != null && head.next != null) {
			firstTail.next = head;
			secondTail.next = head.next;

			firstTail = firstTail.next;
			secondTail = secondTail.next;

			head = head.next.next;
		}

		if(head != null) {
			firstTail.next = head;
			firstTail = firstTail.next;
		}

		firstTail.next = null;
		secondTail.next = null;

		Node head1 = reverseLinkedList(firstHead);
		Node head2 = reverseLinkedList(secondHead);

		print(head1);
		print(head2);
	}

	public static Node reverseLinkedList(Node head) {
		Node newHead = null;

		while(head != null) {
			Node next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public static void print(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
}