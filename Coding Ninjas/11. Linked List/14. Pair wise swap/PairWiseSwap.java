import java.util.*;

public class PairWiseSwap {
	static Node head;

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

		Node newHead = pairWiseSwap(head);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node pairWiseSwap(Node head) {
		Node temp = head;

		while (temp != null && temp.next != null) {

			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
        return head;
	}
}