import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows for matrix-1");
		int r1 = sc.nextInt();
		System.out.println("Enter number of columns for matrix-1");
		int c1 = sc.nextInt();

		int[][] one = new int[r1][c1];

		for(int i = 0; i < one.length; i++) {
			for(int j = 0; j < one[0].length; j++) {
				System.out.println("Enter value at "+i+" , "+j);
				one[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter number of rows for matrix-2");
		int r2 = sc.nextInt();
		System.out.println("Enter number of columns for matrix-2");
		int c2 = sc.nextInt();

		int[][] two = new int[r2][c2];

		for(int i = 0; i < two.length; i++) {
			for(int j = 0; j < two[0].length; j++) {
				System.out.println("Enter value at "+i+" , "+j);
				two[i][j] = sc.nextInt();
			}
		}

		if(c1 != r2) {
			System.out.println("Invalid input!");
			return;
		}

		int[][] prd = new int[r1][c2];

		for (int i = 0; i < r1; i++) {
			 for (int j = 0; j < c2; j++) {
				int sum = 0;

				for (int k = 0; k < c1; k++) {
				   sum += one[i][k] * two[k][j];
				}

				prd[i][j] = sum;
			 }
		}

	    for (int i = 0; i < r1; i++) {
	        for (int j = 0; j < c2; j++) {
				System.out.print(prd[i][j] + " ");
		    }
		    System.out.println();
        }
	}
}