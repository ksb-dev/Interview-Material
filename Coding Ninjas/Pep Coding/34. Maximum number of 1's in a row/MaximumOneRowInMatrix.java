public class MaximumOneRowInMatrix {
	public static void main(String[] args) {
		int[][] mat = {{0, 0, 1}, {0, 1, 1}, {0, 0, 1}};
		int max = 0;
		int rowIndex = 0;

		for(int i = 0; i < mat.length; i++) {
			int countOfOne = binarySearch(mat, i);

			if(countOfOne > max) {
				max = countOfOne;
				rowIndex = i;
			}
		}
		System.out.println(rowIndex);
	}

	public static int binarySearch(int[][] mat, int row) {
		int low = 0;
		int high = mat[0].length - 1;
		int firstIndexOfOne = 0;

		while(low <= high) {
			int mid = (low + high) / 2;

			if(mat[row][mid] == 1) {
				firstIndexOfOne = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		int count = mat[0].length - firstIndexOfOne;
		return count;
	}
}