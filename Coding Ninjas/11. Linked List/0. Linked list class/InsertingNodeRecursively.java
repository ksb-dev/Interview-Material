public class InsertingNodeRecursively {

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
        
        if(head == null) {
            return head;
        }
        
        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);

		if(pos == 0) {
			newNode.next = head;
		    return newNode;
		}
        
        LinkedListNode<Integer> node = insertR(head.next, data, pos - 1);
        head.next = node;
        
        return head;
	}
}