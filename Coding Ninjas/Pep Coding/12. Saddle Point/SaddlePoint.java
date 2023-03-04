// The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

import java.util.Scanner;

public class SaddlePoint {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows & columns for matrix");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Enter value at "+i+" , "+j);
				arr[i][j] = sc.nextInt();
			}
		}

		// diagonal traversal
		for(int i = 0; i < arr.length; i++){
		 // find min of the row
		 int min = 0;

		 for(int j = 1; j < arr[0].length; j++){
			if(arr[i][j] < arr[i][min]){
			   min = j;
			}
		 }

		 // check if no value is higher than this value in it's column
		 boolean flag = true;
		 for(int k = 0; k < arr.length; k++){
			if(arr[k][min] > arr[i][min]){
			   flag = false;
			   break;
			}
		 }

		 if(flag == true){
			System.out.println(arr[i][min]);
			return;
         }
	 }
	 System.out.println("Invalid input");
	}
}