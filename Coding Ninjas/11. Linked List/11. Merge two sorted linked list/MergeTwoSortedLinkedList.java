import java.util.*;

public class MergeTwoSortedLinkedList {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(4);

		Node node4 = new Node(3);
		Node node5 = new Node(5);

		Node head1 = node1;
		node1.next = node2;
		node2.next = node3;

		Node head2 = node4;
		node4.next = node5;

		Node newHead = merge(head1, head2);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node merge(Node headA, Node headB) {
		Node dummyNode = new Node(0);

		/* tail points to the
		last result node */
		Node tail = dummyNode;

		while(true) {

			/* if either list runs out,
			use the other list */
			if(headA == null) {
				tail.next = headB;
				break;
			}

			if(headB == null) {
				tail.next = headA;
				break;
			}

			/* Compare the data of the two
			lists whichever lists' data is
			smaller, append it into tail and
			advance the head to the next Node
			*/
			if(headA.data <= headB.data) {
				tail.next = headA;
				headA = headA.next;
			}

			else {
				tail.next = headB;
				headB = headB.next;
			}

			/* Advance the tail */
			tail = tail.next;
		}
        return dummyNode.next;
	}
}