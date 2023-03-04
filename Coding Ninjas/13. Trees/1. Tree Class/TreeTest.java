import java.util.Scanner;
import java.util.Queue;

public class TreeTest {

	public static TreeNode<Integer> takeInput(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		int nodeData;

		System.out.println("Enter node data");

		nodeData = sc.nextInt();

		TreeNode<Integer> root = new TreeNode<>(nodeData);

		System.out.println("Enter number of children for : "+nodeData);

		int childCount = sc.nextInt();

		for(int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + " : ";

		for(int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data +  " , ";
		}
		System.out.println(s);

		for(int i = 0; i < root.children.size(); i++) {
		    print(root.children.get(i));
		}
	}

	public static TreeNode takeInputLevelWise() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter root data");

		int rootData = sc.nextInt();

		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);

		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();

				System.out.println("Enter number of nodes of : "+frontNode.data);

				int numChildren = sc.nextInt();

				for(int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " +frontNode.data);

					int child = sc.nextInt();

					TreeNode<Integer> childNode = new TreeNode<>(child);

					frontNode.children.add(childNode);

					pendingNodes.enqueue(childNode);
				}
			}
			catch(QueueEmptyException e) {
				return null;
			}
		}

		return root;
	}

	public static void printLevelWise(TreeNode<Integer> root) {
		if(root == null){
		    return;
		}

		QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<>();
		TreeNode<Integer> nullNode = new TreeNode<>(Integer.MIN_VALUE);

		q.enqueue(root);
		q.enqueue(nullNode);

		while(q.size() != 1){
			TreeNode<Integer> temp = null;

			try{
				temp = q.dequeue();
			}
			catch (QueueEmptyException e){

			}

			System.out.print("temp.data : "+temp.data+" ");

			if(temp == nullNode){
				q.enqueue(nullNode);

				System.out.println();

				continue;
			}

			for(int i = 0; i < temp.children.size(); i++){
				System.out.print(temp.children.get(i).data+" ");
				q.enqueue(temp.children.get(i));
			}
		}
	}

	public static int numberOfNodes(TreeNode<Integer> root) {
		if(root == null) return -1;

		int count = 1;

		for(int i = 0; i < root.children.size(); i++) {
			count += numberOfNodes(root.children.get(i));
		}
		return count;
	}

	public static int sumOfNodes(TreeNode<Integer> root) {
		if(root == null) return -1;

		int sum = root.data;

		//System.out.println("root.data : "+root.data);

		for(int i = 0; i < root.children.size(); i++) {
			sum += sumOfNodes(root.children.get(i));
		}
		return sum;
	}

	public static int nodeWithLargestData(TreeNode<Integer> root) {
		if(root == null) return -1;

		int max = root.data;

		for(int i = 0; i < root.children.size(); i++) {
			int value = nodeWithLargestData(root.children.get(i));

			if(max < value) {
				max = value;
			}
		}
		return max;
	}

	static int count = 0;

	public static int numberOfNodesGreaterThanX(TreeNode<Integer> root, int x) {

		if(root == null) return -1;

		if(root.data > x) count++;

		for(int i = 0; i < root.children.size(); i++) {
			numberOfNodesGreaterThanX(root.children.get(i), x);
		}
		return count;
	}

	static int height = 0;
    static int maxHeight = 0;

	public static int heightOfATree(TreeNode<Integer> root) {
		if(root == null) return -1;

		for(int i = 0; i < root.children.size(); i++) {
			heightOfATree(root.children.get(i));
			height++;

			if(height > maxHeight) {
				maxHeight = height;
			}
		}

		return maxHeight + 1;
	}

	public static int countOfLeafNodes(TreeNode<Integer> root){
		if (root.children.size() == 0) {
			count++;
		}
		for (int i = 0; i < root.children.size(); i++) {
			countOfLeafNodes(root.children.get(i));
		}
		return count;
	}

	public static void printPostOrder(TreeNode<Integer> root){
		for(int i = 0; i < root.children.size(); i++) {
			printPostOrder(root.children.get(i));

		}
		System.out.print(root.data+" ");
	}

	public static void printPreOrder(TreeNode<Integer> root){
		System.out.print(root.data+" ");

		for(int i = 0; i < root.children.size(); i++) {
			printPostOrder(root.children.get(i));

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*TreeNode root = takeInput(sc);
		print(root);*/

		/*TreeNode root = takeInputLevelWise();
		printLevelWise(root);*/

		/*TreeNode root = takeInputLevelWise();
		int count = numberOfNodes(root);

		System.out.println("Number of nodes : "+count);*/

		/*TreeNode root = takeInputLevelWise();
		int sum = sumOfNodes(root);

		System.out.println("Sum of nodes: "+sum);*/

		/*TreeNode root = takeInputLevelWise();
		int max = nodeWithLargestData(root);

		System.out.println("Node with largest data: "+max);*/

		/*int x = sc.nextInt();

		TreeNode root = takeInputLevelWise();
	    int count = numberOfNodesGreaterThanX(root, x);

		System.out.println("Number of nodes greater than "+ x +" is : "+count);*/

		/*TreeNode root = takeInputLevelWise();
	    int height = heightOfATree(root);

		System.out.println("Height of tree is : "+height);*/

		/*TreeNode root = takeInputLevelWise();
	    int height = heightOfATree(root);

		System.out.println("Height of tree is : "+height)*/

		/*TreeNode root = takeInputLevelWise();
	    printPostOrder(root);*/

	    TreeNode root = takeInputLevelWise();
	    printPreOrder(root);

		/*TreeNode root = new TreeNode(4);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(6);

		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);*/
	}
}

/*
(a) Inorder (Left, Root, Right) : 4 2 5 1 3
(b) Preorder (Root, Left, Right) : 1 2 4 5 3
(c) Postorder (Left, Right, Root) : 4 5 2 3 1
*/

// 4 2 1 0 2 0

// 10 3 20 30 40 2 40 50 0 0 0 0

// 1 3 20 3 40 1 90 2 50 6 1 100 1 150 17 1000 2000
// 3000 4000 5000 6000 7000 85 86 87 88 89 92 93 94
// 95 96 1 80 1 83 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

/*
if(root.data == null) return;

		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();

		pendingNodes.enqueue(root);

		try {
			TreeNode<Integer> frontNode = pendingNodes.front();

		    System.out.println(frontNode.data);
		}
		catch(QueueEmptyException e) {
		}

		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.front();

				pendingNodes.dequeue();

				for(int i = 0; i < frontNode.children.size(); i++) {
					 pendingNodes.enqueue(frontNode.children.get(i));


					 /*if(i == frontNode.children.size() - 1) {
					     System.out.print(frontNode.children.get(i).data);
					 }

					 else {
  	                    System.out.print(frontNode.children.get(i).data+ " ");
					}*/
				/*}

				for(int i = 0; i < pendingNodes.size(); i++) {

				}
				System.out.println();
			}
			catch(QueueEmptyException e) {
				return;
			}
*/