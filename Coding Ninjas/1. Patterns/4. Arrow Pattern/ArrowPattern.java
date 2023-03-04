import java.util.Scanner;

public class ArrowPattern {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if((n % 2) == 0) return;

		int half1 = ((n + 1) / 2);
		int half2 = (n / 2);

		for(int i = 1; i <= half1; i++) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i = 1; i <= half2; i++) {
			for(int j = 0; j < half2 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= half2 - i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}