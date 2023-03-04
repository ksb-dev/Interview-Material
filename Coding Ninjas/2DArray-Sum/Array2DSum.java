import java.util.Scanner;

public class Array2DSum {

	public static void main(String[] args) {
		//Your code goes here
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();

		System.out.println("Enter the number of columns");
		int cols = s.nextInt();

		int[][] mat = new int[rows][cols];


		for(int i = 0; i < rows; i++) {
		    for(int j = 0;  j < cols; j++) {
			System.out.println("Enter element at "+i+" row "+j+" column");
			mat[i][j] = s.nextInt();
			System.out.println(mat[i].length+" "+mat[j].length);
		    }
		}*/

		/*for(int i = 0; i < mat.length; i++) {
		    int sum = 0;
		    for(int j = 0;  j < mat[i].length; j++) {
		       sum = sum + mat[i][j];
		       System.out.println(mat.length+" "+mat[i].length);
		    }
		    System.out.print(sum+" ");
		}*/

		int[][] mat = new int[2][4];

		System.out.println(mat.length);
		for(int i = 0; i < mat.length; i++) {
			System.out.println(i);
		}
	}
}