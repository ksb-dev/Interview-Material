import java.util.*;

public class BinaryToDecimal {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(0);
		Node node2 = new Node(0);
		Node node3 = new Node(1);
		Node node4 = new Node(1);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		System.out.print(binaryToDecimal(head));
		System.out.println();
	}

	public static int binaryToDecimal(Node head) {
		int res = 0;

		// Traverse linked list
		while (head != null) {
			// Multiply result by 2 and add
			// head's data
			res = (res * 2) + (head.data);

			// Move next
			head = head.next;
		}
        return res;
	}
}