import java.util.*;

public class ReverseALinkedList {
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		Node<Integer> head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		Node<Integer> temp = head;

		System.out.println("Before reversing a linked list");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();

		Node<Integer> newHead = reverseLinkedList(head);

		System.out.println("After reversing a linked list");
		while(newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
		System.out.println();
	}

	public static Node<Integer> reverseLinkedList(Node<Integer> head) {
		Node<Integer> newHead = null;

		while(head != null) {
			Node<Integer> next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}
}

/*
if (head == null || head.next == null)
            return head;

        LinkedListNode<Integer> rest = reverseLinkedListRec(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
*/