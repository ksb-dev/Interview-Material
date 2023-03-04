import java.util.Scanner;

public class TwoOppositeNinetyDegreeTriangle {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++)
                System.out.print(j);

		    for (int j= i*2 ; j < rows*2; j++)
		        System.out.print(" ");

		    for (int k = i; k >= 1; k--)
		        System.out.print(k);

		    System.out.println();
        }

	}
}