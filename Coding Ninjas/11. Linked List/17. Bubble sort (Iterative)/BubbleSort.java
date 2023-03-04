import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Node node1 = new Node(10);
		Node node2 = new Node(8);
		Node node3 = new Node(5);
		Node node4 = new Node(12);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		Node newHead = bubbleSort(head);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node bubbleSort(Node head) {
		if(head == null || head.next == null) {
			return head;
		}

		Node current = head, index = null;
		int temp;

		while(current.next != null) {
			index = current.next;
			while(index != null) {
				if(current.data > index.data) {
					temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
		return head;
	}
}