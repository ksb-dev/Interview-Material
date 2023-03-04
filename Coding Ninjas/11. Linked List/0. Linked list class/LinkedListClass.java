import java.util.Scanner;

public class LinkedListClass {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Node<Integer> tail = null;

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);

			if(head == null) {
				head = newNode;
				tail = head;
			}
			else {
				// O(n^2)
				/*Node<Integer> temp = head;

				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;*/

				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}

	public static int length(Node<Integer> head){
		int length = 0;

		while(head != null) {
			length++;
			head = head.next;
		}

		System.out.println("Length of linked list : "+length);
		System.out.println();

		return length;
	}

	public static void printIthNode(Node<Integer> head, int i){
		int index = 0;
		int data = 0;

		while(index <= i) {
			index++;

			if(head == null) {
				return;
			}

			data = head.data;

			if(data == -1) {
				return;
			}

			head = head.next;
		}
		System.out.println("Node present at "+i+" position : "+data);
		System.out.println();
	}

	public static Node<Integer> insertAtIthPosition(Node<Integer> head, int data, int position) {
		Node<Integer> newNode = new Node<>(data);

		if(position == 0) {
			newNode.next = head;
		    return newNode;
		}

		int i = 0;
		Node<Integer> temp = head;

        while(i < (position - 1)) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;

		System.out.println("After inserting element "+data+" at "+position+" position");
		return head;
	}

	public static Node<Integer> deleteAtIthPosition(Node<Integer> head, int position) {

		if(head == null) {
			return head;
		}

		Node<Integer> temp = head;

		if(position == 0) {
			head = temp.next;
			return head;
		}

		int i = 0;

		while(i < (position - 1) && temp != null) {
			temp = temp.next;
			i++;
		}

		if(temp == null || temp.next == null) {
			return head;
		}

		Node<Integer> next = temp.next.next;

		temp.next = next;

		return head;
	}

	public static void print(Node<Integer> head){

		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {

		/*Node<Integer> node1 = new Node<>(10);
		Node<Integer> node2 = new Node<>(20);
		Node<Integer> node3 = new Node<>(30);

		Node<Integer> head = node1;
		node1.next = node2;
		node2.next = node3;*/

		Node<Integer> head = takeInput();
		print(head);
		length(head);
		printIthNode(head, 2);
		int data = 80;
		//head = insertAtIthPosition(head, data, 4);
		//print(head);
		head = deleteAtIthPosition(head, 0);
		print(head);
	}
}

// 10 20 30 40 50 -1
// 10 20 30 40 -1