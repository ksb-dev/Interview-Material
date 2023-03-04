import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNodeTest {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;

		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();

		q.add(root);

		while(true) {

			int nodeCount = q.size();

			if(nodeCount == 0)
				break;

			while(nodeCount > 0) {
				BinaryTreeNode<Integer> frontNode = q.peek();

				//System.out.print(frontNode.data + " ");
				System.out.print(frontNode.data+ " : ");

				q.remove();

				if(frontNode.left != null) {
					System.out.print("Left : "+ frontNode.left.data+" ");
					q.add(frontNode.left);
				}

				if(frontNode.right != null) {
					System.out.print("Right : "+ frontNode.right.data);
					//System.out.println();
					q.add(frontNode.right);
				}

				nodeCount--;
			}
			System.out.println();
		}
    }

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner sc = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();

		System.out.println("Enter root data");

		int rootData = sc.nextInt();

		if(rootData == -1) return null;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		q.add(root);

		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = q.remove();

			System.out.println("Enter left child of : "+frontNode.data);
			int leftChild = sc.nextInt();

			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
				q.add(child);
				frontNode.left = child;
			}

			System.out.println("Enter right child of : "+frontNode.data);
			int rightChild = sc.nextInt();

			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				q.add(child);
				frontNode.right = child;
			}
		}
		return root;
	}

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) return;

		String s = root.data+ " --> ";

		if(root.left != null) s += "Left : " + root.left.data + " , ";

		if(root.right != null) s += "Right : " + root.right.data;

		System.out.println(s);

		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner sc) {
		System.out.println("Enter root data");
		int rootData = sc.nextInt();

		if(rootData == -1) return null;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		root.left = takeInput(sc);
		root.right = takeInput(sc);

		return root;
	}

	public static void main(String[] args) {
		/*BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		root.left = new BinaryTreeNode<>(2);
		root.right = new BinaryTreeNode<>(3);*/

		/*Scanner sc = new Scanner(System.in);

		BinaryTreeNode<Integer>  root = takeInput(sc);
		printBinaryTree(root);*/

		BinaryTreeNode<Integer>  root = takeInputLevelWise();
		printLevelWise(root);
	}
}