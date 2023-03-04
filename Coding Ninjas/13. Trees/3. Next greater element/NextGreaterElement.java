import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class NextGreaterElement {

    public static TreeNode<Integer> ans = null;
	public static TreeNode<Integer> temp = null;
    public static Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

		// Write your code here
        if (ans == null) {
			if (root.data > n) {
				ans = root;
			}
		}
        else {
			if (root.data < ans.data && root.data > n) {
				ans = root;
			}
		}

		for (int i = 0; i < root.children.size(); i++) {
			pendingNodes.add(root.children.get(i));

			try {
				temp = findNextLargerNode(pendingNodes.remove(), n);

				if (temp.data > n) {
					if (temp.data < ans.data) {
						ans = temp;
					}
				}

			}
            catch (Exception e) {
				e.printStackTrace();
			}
		}
        return ans;
	}

	public static TreeNode takeInputLevelWise() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter root data");

		int rootData = sc.nextInt();

		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);

		pendingNodes.add(root);

		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.remove();

			System.out.println("Enter number of nodes of : "+frontNode.data);

			int numChildren = sc.nextInt();

			for(int i = 0; i < numChildren; i++) {
				System.out.println("Enter " + (i + 1) + "th child of " +frontNode.data);

				int child = sc.nextInt();

				TreeNode<Integer> childNode = new TreeNode<>(child);

				frontNode.children.add(childNode);

				pendingNodes.add(childNode);
			}
		}

		return root;
	}

	public static void printLevelWise(TreeNode<Integer> root) {

		if(root == null){
			return;
		}

		Queue<TreeNode<Integer>> q = new LinkedList<>();
		TreeNode<Integer> nullNode = new TreeNode<>(Integer.MIN_VALUE);

		q.add(root);
		q.add(nullNode);

		System.out.println(root.data);

		while(q.size() != 1) {
			TreeNode<Integer> temp = null;

            temp = q.remove();

			if(temp == nullNode) {
				q.add(nullNode);

				System.out.println();

				continue;
			}

			for(int i = 0; i < temp.children.size(); i++) {
				System.out.print(temp.children.get(i).data+" ");
				q.add(temp.children.get(i));
			}
		}

    }

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();

		System.out.println(findNextLargerNode(root, 18).data);

		System.out.println("---------");

		printLevelWise(root);
	}
}