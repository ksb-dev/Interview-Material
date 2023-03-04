public class SearchInARowWiseAndColumnWiseSortedMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{4, 6, 1},{5, 9, 10},{13, 2, 5}};
		int n = matrix.length;
		int x = 2;

		if (n == 0) {
			//return new Pair(-1, -1);
			System.out.println(-1+" , "+-1);
			return;
		}

		for (int i = 0; i < n; ++i) {

			int l = 0;
			int r = n - 1;

			// Binary search each row.
			while (l <= r) {

				int mid = (l + r) / 2;
				if (matrix[i][mid] == x) {
					//return new Pair(i, mid);
					System.out.println(i+" , "+mid);
					return;
				}

				if (matrix[i][mid] > x) {
					r = mid - 1;
				}
				else {
					l = mid + 1;
				}
			}
		}

        //return new Pair(-1, -1);
        System.out.println(-1+" , "+-1);
	}
}