import java.util.*;

public class MoveLastNodeToFirst {
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

		Node newHead = moveLastToFirst(head);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node moveLastToFirst(Node head) {
		int count = 0;
		Node newHead = head;
		Node current = head;
		Node prev = head;

		while(newHead != null) {
			count++;
			current = newHead;
			newHead = newHead.next;
		}

		int i = 0;

		while(i < count - 2) {
			prev = prev.next;
			i++;
		}

		current.next = head;
		prev.next = null;

		return current;
	}
}
