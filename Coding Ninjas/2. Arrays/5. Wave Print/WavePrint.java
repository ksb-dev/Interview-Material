public class WavePrint {
	public static void main(String[] args) {
		//int[][] mat = {{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
		//int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int row = mat.length;
		int col = mat[0].length;

		for(int j = 0; j < col; j++) {
			if(j%2 == 0) {
				for(int i = 0; i < row; i++) {
					System.out.print(mat[i][j]+" ");
			    }
			}
			else {
				for(int i = row-1; i >= 0; i--) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
	}
}

//1 4 7 10 11 8 5 2 3 6 9 12