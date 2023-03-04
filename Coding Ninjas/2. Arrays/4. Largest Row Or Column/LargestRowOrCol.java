public class LargestRowOrCol {
	public static void main(String[] args) {
		int[][] mat = {{3,6,9},{1,4,7},{2,8,9}};
		//int[][] mat = {{0},{0}};

		int row = mat.length;
		int col = mat[0].length;
		int rowIndex = 0;
		int colIndex = 0;
		int largestRow = Integer.MIN_VALUE;
		int largestCol = Integer.MIN_VALUE;
		int maxResult = 0;
		int index = 0;
		String s = "";

		for(int i = 0; i < row; i++) {
			int sum = 0;
			for(int j = 0; j < col; j++) {
				sum = sum + mat[i][j];
			}
			if(sum == 0) {
				largestRow = Integer.MIN_VALUE;
				continue;
			}
			if(sum > largestRow) {
				largestRow = sum;
				rowIndex = i;
			}
		}

		for(int j = 0; j < col; j++) {
			int sum = 0;
			for(int i = 0; i < row; i++) {
				sum = sum + mat[i][j];
			}
			if(sum == 0) {
				largestCol = Integer.MIN_VALUE;
				continue;
			}
			if(sum > largestCol) {
				largestCol = sum;
				colIndex = j;
			}
		}

		if(largestRow >= largestCol) {
			maxResult = largestRow;
			s = "row";
			index = rowIndex;
		}
		else {
			maxResult = largestCol;
			s = "column";
			index = colIndex;
		}

        System.out.println(s+" "+index+" "+maxResult);
	}
}