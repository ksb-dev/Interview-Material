import java.util.*;

public class EvenAfterOddNode {
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

		Node newHead = evenOdd(head);

		while(newHead != null) {
			System.out.println(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node evenOdd(Node head) {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
        Node currentNode = head;

		while(currentNode != null) {
			int element = currentNode.data;

			if(element % 2 == 0) {

				if(evenStart == null) {
					evenStart = currentNode;
					evenEnd = evenStart;
				} else {
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}

			} else {

				if(oddStart == null) {
					oddStart = currentNode;
					oddEnd = oddStart;
				} else {
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			// Move head pointer one step in forward direction
			currentNode = currentNode.next;
		}


		if(oddStart == null || evenStart == null) {
			return head;
		}

		oddEnd.next = evenStart;
		evenEnd.next = null;
        head = oddStart;

        return head;
	}
}