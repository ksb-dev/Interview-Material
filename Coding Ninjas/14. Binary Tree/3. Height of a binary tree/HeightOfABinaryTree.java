import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOfABinaryTree {

	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		int maxHeight = 1 + Math.max(leftHeight, rightHeight);

		return maxHeight;
	}

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

	public static void main(String[] args) {

		BinaryTreeNode<Integer>  root = takeInputLevelWise();

		System.out.println(height(root));
		//printLevelWise(root);
	}
}