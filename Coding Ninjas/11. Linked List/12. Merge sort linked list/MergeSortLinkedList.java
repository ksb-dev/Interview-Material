import java.util.*;

public class MergeSortLinkedList {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(6);
		Node node3 = new Node(4);
		Node node4 = new Node(3);
		Node node5 = new Node(5);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node newHead = mergeSort(head);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node mergeSort(Node h) {
		if (h == null || h.next == null) {
			return h;
		}

		// get the middle of the list
		Node middle = getMiddle(h);
		Node nextofmiddle = middle.next;

		// set the next of middle node to null
		middle.next = null;

		// Apply mergeSort on left list
		Node left = mergeSort(h);

		// Apply mergeSort on right list
		Node right = mergeSort(nextofmiddle);

		// Merge the left and right lists
		Node sortedlist = sortedMerge(left, right);
        return sortedlist;
	}

	public static Node getMiddle(Node head) {
		if (head == null)
			return head;

		Node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }

    public static Node sortedMerge(Node a, Node b) {
		Node result = null;
		/* Base cases */
		if (a == null)
			return b;
		if (b == null)
			return a;

		/* Pick either a or b, and recur */
		if (a.data <= b.data) {
			result = a;
			result.next = sortedMerge(a.next, b);
		}
		else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
    }
}