import java.util.*;

public class MoveToLast {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(4);
		Node node4 = new Node(2);
		Node node5 = new Node(5);

		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		int key = 2;

		Node newHead = moveToLast(head, key);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node moveToLast(Node head, int key) {

		Node tail = head;

		if (head == null) {
			return null;
		}

		while (tail.next != null) {
			tail = tail.next;
		}

		// Node to point to last of linked list
		Node last = tail;

		Node current = head;
		Node prev = null;

		// Node prev2 to point to previous when head.data!=key
		Node prev2 = null;

		// loop to perform operations to remove key to end
		while (current != tail) {
			if (current.data == key && prev2 == null) {
				prev = current;
				current = current.next;
				head = current;
				last.next = prev;
				last = last.next;
				last.next = null;
				prev = null;
			}
			else {
				if (current.data == key && prev2 != null) {
					prev = current;
					current = current.next;
					prev2.next = current;
					last.next = prev;
					last = last.next;
					last.next = null;
				}
				else if (current != tail) {
					prev2 = current;
					current = current.next;
				}
			}
		}
        return head;
		/*Node pKey = head;

		// Traverse list
		Node pCrawl = head;

		while (pCrawl != null) {
			// If current pointer is not same as pointer
			// to a key location, then we must have found
			// a key in linked list. We swap data of pCrawl
			// and pKey and move pKey to next position.
			if (pCrawl != pKey && pCrawl.data != key) {
				pKey.data = pCrawl.data;
				pCrawl.data = key;
				pKey = pKey.next;
			}

			// Find next position where key is present
			if (pKey.data != key)
				pKey = pKey.next;

			// Moving to next Node
			pCrawl = pCrawl.next;
		}

        return head;*/
	}
}