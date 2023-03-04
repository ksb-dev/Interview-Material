import java.util.*;

public class RotateMatrixRightByKTimes {
	public static void main(String[] args) {
         int[][] matrix = {{12, 23, 34}, {45, 56, 67}, {78, 89, 91}};
         int M = matrix.length;
         int N = matrix[0].length;

         int k = 2;

         int temp[]=new int[M];

		 // within the size of matrix
		 k = k % M;
		 System.out.println("k :"+k);

		 for (int i = 0; i < N; i++) {

			 // copy first M-k elements
			 // to temporary array
			 for (int t = 0; t < M - k; t++)
			 temp[t] = matrix[i][t];

			 //System.out.print("temp : "+Arrays.toString(temp)+" ");
			 //System.out.println();

			 // copy the elements from k
			 // to end to starting
			 for (int j = M - k; j < M; j++) {
				 //System.out.println("j : "+j);
				 //System.out.println("(j - M + k) : "+(j - M + k));
				 matrix[i][j - M + k] = matrix[i][j];
			 }

			 //System.out.print("matrix : "+Arrays.toString(matrix[0])+" ");
			 //System.out.println();

			 // copy elements from
			 // temporary array to end
			 for (int j = k; j < M; j++){
				 //System.out.println("k : "+k);
				 //System.out.println("(j - k) : "+(j - k));
				 matrix[i][j] = temp[j - k];
			 }

			 //System.out.print("matrix : "+Arrays.toString(matrix[0])+" ");
			 //System.out.println();
			 //System.out.println("-------------");
         }


         for(int p = 0; p < matrix.length; p++) {
			for(int q = 0; q < matrix[0].length; q++) {
				System.out.print(matrix[p][q]+" ");
			}
			System.out.println();
		 }
	}
}


/*
int temp[]=new int[M];

		 // within the size of matrix
		 k = k % M;
		 System.out.println("k :"+k);

		 for (int i = 0; i < N; i++)
		 {

			 // copy first M-k elements
			 // to temporary array
			 for (int t = 0; t < M - k; t++)
			 temp[t] = matrix[i][t];

			 System.out.print("temp : "+Arrays.toString(temp)+" ");
			 System.out.println();

			 // copy the elements from k
			 // to end to starting
			 for (int j = M - k; j < M; j++) {
				 System.out.println("j : "+j);
				 System.out.println("(j - M + k) : "+(j - M + k));
			     matrix[i][j - M + k] = matrix[i][j];
		     }

			 System.out.print("matrix : "+Arrays.toString(matrix[0])+" ");
			 System.out.println();

			 // copy elements from
			 // temporary array to end
			 for (int j = k; j < M; j++){
				 System.out.println("k : "+k);
				 System.out.println("(j - k) : "+(j - k));
			     matrix[i][j] = temp[j - k];
			 }

			 System.out.print("matrix : "+Arrays.toString(matrix[0])+" ");
			 System.out.println();
			 System.out.println("-------------");
        }

*/