import java.util.*;

public class RowWaveForm {
	public static void main(String[] args) {
		 ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >();
		 ArrayList<Integer> a1 = new ArrayList<>();
		 a1.add(1);
		 a1.add(2);
		 a1.add(4);
		 aList.add(a1);
		 ArrayList<Integer> a2 = new ArrayList<>();
		 a2.add(0);
		 a2.add(5);
		 a2.add(7);
		 aList.add(a2);

		 rowWaveForm(aList);
	}

	public static void rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		int n = mat.size();
		int m = mat.get(0).size();

		// This array stores our answer.
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for(int i = 0; i < mat.size(); i++) {
			boolean row = (i % 2) == 0 ? true : false;

			if(row) {
				for (int j = 0; j < mat.get(0).size(); j++) {
					ans.add(mat.get(i).get(j));
				}
			}
			else {
				for (int j = mat.get(0).size() - 1; j >= 0; j--) {
					ans.add(mat.get(i).get(j));
				}
			}
		}

		System.out.println(ans);

	}
}


/*
for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				ans.add(1);

				if ((i & 1) == 1) {
					// If the current row is odd then we need to sweep it right to left.
					ans.set(i * m + j, mat.get(i).get(m - 1 - j));
				} else {
					// If the current row is even then we need to sweep it left to right.
					ans.set(i * m + j, mat.get(i).get(j));
				}
			}
		}

		// Return the final answer.
		return ans;
*/
