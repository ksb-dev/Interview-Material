import java.util.*;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		int s = 5;

		// HashMap to store frequency of elements.
		HashMap<Integer, Integer> map = new HashMap();

		// This will store the result.
		List<int[]> ans = new ArrayList();
		for (int ele : arr) {
			int count = map.getOrDefault(s - ele, 0);

			int[] pair = new int[2];
			pair[0] = ele;
			pair[1] = s - ele;

			while (count-- > 0) {
				ans.add(pair);
			}

			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}

		// This will to store final result.
		int res[][] = new int[ans.size()][2];

		// Sorting the 'ans' arrays element.
		for (int i = 0; i < ans.size(); i++) {
			int a = ans.get(i)[0], b = ans.get(i)[1];
			res[i][0] = Math.min(a, b);
			res[i][1] = Math.max(a, b);
		}

		// Finally sorting each pair in 'res'.
		Arrays.sort(res, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});

        for(int i = 0; i < res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
	}
}