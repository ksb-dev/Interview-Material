import java.util.*;

public class SwapNodesInLinkedList {
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		Node<Integer> node6 = new Node<>(6);
		Node<Integer> head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;

		swapNodes(head, 0, 5);
	}

	public static void swapNodes(Node<Integer> head, int i, int j) {

		Node<Integer> temp = head, prev = null, c1 = null, c2 = null, p1 = null, p2 = null;

		int pos = 0;

		if(i == j) return;

		while(temp != null) {

			if(pos == i) {
				p1 = prev;
				c1 = temp;
			}
			else if(pos == j) {
				p2 = prev;
				c2 = temp;
			}
			prev = temp;
			temp = temp.next;
			pos++;
		}

		if(p1 != null) {
			p1.next=c2;
		}

		else{
			head = c2;
		}

		if(p2 != null){
			p2.next = c1;
		}

		else{
			head = c1;
		}

		Node<Integer> temp1 = c2.next;
		c2.next = c1.next;
		c1.next = temp1;

		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
