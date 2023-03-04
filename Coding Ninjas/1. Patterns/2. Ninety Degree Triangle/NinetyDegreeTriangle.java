import java.util.Scanner;

public class NinetyDegreeTriangle {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = 1, space = n-1;

		for ( int i = 1 ; i <= n ; i++ ) {
		    num = i;

			for ( int j = 1 ; j <= space ; j++ )
			    System.out.print(" ");

		    space--;

			for ( int p = 1 ; p <= i ; p++ ) {
				System.out.print(num);
				num++;
			}

			System.out.println();
        }
		
	}

}