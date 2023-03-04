import java.util.Scanner;

public class ExitPoint {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows for matrix-1");
		int n = sc.nextInt();
		System.out.println("Enter number of columns for matrix-1");
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println("Enter value at "+i+" , "+j);
				arr[i][j] = sc.nextInt();
			}
		}

		int i = 0;
	    int j = 0;
	    int dir = 0;

	    while (true) {
		   dir = (dir + arr[i][j]) % 4;
		   if (dir == 0) {
			j++;
		   }
		   else if (dir == 1) {
			  i++;
		   }
		   else if (dir == 2) {
			  j--;
		   }
		   else if (dir == 3) {
			  i--;
		   }

		   if (i < 0) {
			  i++;
			  break;
		   }
		   else if (j < 0) {
			  j++;
			  break;
		   }
		   else if (i == n) {
			  i--;
			  break;
		   }
		   else if (j == m) {
			  j--;
			  break;
		   }
	    }

	    System.out.println(i);
	    System.out.println(j);
	}
}