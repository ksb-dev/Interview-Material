import java.util.*;

public class CheckLinkedListPalindrome {
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(2);
		Node<Integer> node5 = new Node<>(1);
		//Node<Integer> node6 = new Node<>(1);
		Node<Integer> head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		//node5.next = node6;

		System.out.println(isPalindrome(node1));
	}

	public static boolean isPalindrome(Node<Integer> head) {
		if(head == null || head.next == null) return true;

		Node<Integer> middle = findMiddleNode(head);

		middle.next = reverseLinkedList(middle.next);

		middle = middle.next;

		while(middle != null) {
			if(head.data != middle.data) return false;

			head = head.next;
			middle = middle.next;
		}
		return true;
	}
	public static Node<Integer> findMiddleNode(Node<Integer> head) {
		Node<Integer> slow = head, fast = head;

		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> reverseLinkedList(Node<Integer> head) {

		Node<Integer> previous = null;
		Node<Integer> current = head;
		Node<Integer> next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;

        return head;
	}
}