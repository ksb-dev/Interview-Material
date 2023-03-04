import java.util.*;

public class FindMiddleOfLinkedList {
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

		Node<Integer> middle = findMiddleNode(head);
		System.out.println("Middle node is : "+middle.data);
	}

	public static Node<Integer> findMiddleNode(Node<Integer> head) {
		Node<Integer> slow = head, fast = head;

		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}

/*

LinkedListNode<Integer> slow = head, fast = head, newHead = head, prev = null;

        int count = 0;

        while(newHead != null) {
            count++;
            newHead = newHead.next;
        }


		while(fast != null && fast.next != null) {
            prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

        if(count % 2 == 0) {
            return prev;
        }
		return slow;
*/