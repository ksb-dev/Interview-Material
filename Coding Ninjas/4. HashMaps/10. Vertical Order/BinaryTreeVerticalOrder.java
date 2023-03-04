import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;


public class BinaryTreeVerticalOrder{

	/*	Binary Tree Node class
	 *
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */
    public static void getVerticalOrder(BinaryTreeNode<Integer> root, int hd, HashMap<Integer,Vector<Integer>> m)
    {
        // Base case
        if(root == null)
            return;

        //get the vector list at 'hd'
        Vector<Integer> v =  m.get(hd);

        // Store current node in map 'm'
        if(v == null)
        {
            v = new Vector<>();
            v.add(root.data);
        }
        else
            v.add(root.data);

        m.put(hd, v);

        // Store nodes in left subtree
        getVerticalOrder(root.left, hd-1, m);

        // Store nodes in right subtree
        getVerticalOrder(root.right, hd+1, m);
    }

	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */

        // Create a map and store vertical order in map using
        // function getVerticalOrder()
		HashMap<Integer,Vector<Integer>> m = new HashMap<>();

        int hd =0;

        getVerticalOrder(root,hd,m);

        // Traverse the map and print nodes at every horigontal
        // distance (hd)
        /*for (Entry<Integer, Vector<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }*/

        Set<Integer> set1 = m.keySet();

        // for-each loop
        for(Integer key : set1) {
            Vector v = m.get(key);

            Iterator<Integer> iterate = v.iterator();

            while(iterate.hasNext()) {
                System.out.print(iterate.next()+" ");
            }
            System.out.println();
        }
	}
}