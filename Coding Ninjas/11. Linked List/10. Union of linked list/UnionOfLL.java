import java.util.*;

public class UnionOfLL {
	static Node head;

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(2);

		Node node4 = new Node(2);
		Node node5 = new Node(5);

		Node head1 = node1;
		node1.next = node2;
		node2.next = node3;

		Node head2 = node4;
		node4.next = node5;

		Node newHead = Union(head1, head2);

		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public static Node Union(Node head1, Node head2) {
		// Write your code here
		Node t1 = head1, t2 = head2;

		// insert all elements of list1 in the result
		while (t1 != null) {
			push(t1.data);
			t1 = t1.next;
		}

		// insert those elements of list2
		// that are not present

		while (t2 != null) {
			if (!isPresent(head1, t2.data)) {
				push(t2.data);
			}
			t2 = t2.next;
		}
		System.out.println(head.data);
		return head;
	}

	public static void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				  Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public static boolean isPresent(Node head, int data) {
		Node t = head;

		while (t != null) {
			if (t.data == data)
				return true;
			t = t.next;
		}
		return false;
    }
}