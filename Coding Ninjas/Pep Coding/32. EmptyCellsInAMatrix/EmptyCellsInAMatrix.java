import java.util.*;

public class EmptyCellsInAMatrix {
	public static void main(String[] args) {
		int n = 3;
		int[][] tasks = new int[n][n];
		int k = 2;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = -1;
			}
		}

		long[] ans = new long[k];

		for (int i = 0; i < k; i++) {
			int x = tasks[i][0];
			int y = tasks[i][1];

			for (int j = 0; j < n; j++) {
				matrix[x][j] = 0;
				matrix[j][y] = 0;
			}

			long count = 0;
			for (int j = 0; j < n; j++) {
				for (int p = 0; p < n; p++) {
					if (matrix[j][p] == -1) {
						count++;
						System.out.println(count);
					}
				}
			}

			System.out.println("-------");

			ans[i] = count;
		}
		System.out.println(Arrays.toString(ans));
	}
}

/*
int n = 3;
		int[][] tasks = new int[n][n];
		int k = 2;
		int rows = n;
		int columns = n;


		long ans[] = new long[k];

		HashSet<Integer> rowSet = new HashSet<>();
		HashSet<Integer> colSet = new HashSet<>();

		for (int i = 0; i < k; i++) {

			int x = tasks[i][0];
			int y = tasks[i][1];

			if (!rowSet.contains(x)) {
				rowSet.add(x);
				rows--;;
			}

			if (!colSet.contains(y)) {
				colSet.add(y);
				columns = columns--;
			}

			ans[i] = (long)rows * columns;
		}
		System.out.println(Arrays.toString(ans));
*/