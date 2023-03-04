import java.util.*;

public class RowWiseSum {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		rowWiseSum(arr);
	}

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here

        for(int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0;  j < mat[i].length; j++) {
               sum = sum + mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}
}