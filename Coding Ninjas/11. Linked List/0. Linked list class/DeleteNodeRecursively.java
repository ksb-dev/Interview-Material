public class DeleteNodeRecursively {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head == null) {
			return head;
		}

		LinkedListNode<Integer> temp = head;

		if(pos == 0) {
			head = temp.next;
			return head;
		}
        
        if(temp == null || temp.next == null) {
			return head;
		}

		LinkedListNode<Integer> next = deleteNodeRec(temp.next, pos - 1);

		temp.next = next;

		return head;
	}
}