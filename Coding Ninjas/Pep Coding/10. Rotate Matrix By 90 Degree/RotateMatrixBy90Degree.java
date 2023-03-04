import java.util.Scanner;

public class RotateMatrixBy90Degree {
	public static void main(String[] args) {
		//int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		/*Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows & columns for matrix");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Enter value at "+i+" , "+j);
				arr[i][j] = sc.nextInt();
			}
		}*/

		// Transpose
		for(int i = 0; i < arr.length; i++){
		    for(int j = 0; j < i; j++){
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i] = temp;
			 }
		}

		// reverse columns, row by row
		for(int i = 0; i < arr.length; i++){
		    int li = 0;
			int ri = arr[0].length - 1;

			while(li <= ri){
			    int temp = arr[i][li];
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;

				li++;
				ri--;
			}
        }

        for(int i = 0; i < arr.length; i++){
		  for(int j = 0; j < arr[0].length; j++){
			  System.out.print(arr[i][j] + " ");
		  }
		  System.out.println();
      }
	}
}