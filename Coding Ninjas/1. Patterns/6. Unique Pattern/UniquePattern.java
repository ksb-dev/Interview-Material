public class UniquePattern {

	public static void main(String[] args) {
			printPattern(4);
	}

	public static void printPattern(int n){

		// Write your code here
        int half = 0;
		int half1 = 0;

		if(n % 2 == 0) {
			half = n / 2;
		}
		else {
			half = (n + 1) / 2;
		}

		int boundary = (1 + (half-1)*(n*2));

		for(int i = 1; i <= boundary; i += (n*2)) {
			for(int j = 1, k = i; j <= n; j++, k++) {
				System.out.print(k+" ");
				half1 =  i;
			}
			System.out.println();
		}

		if(n % 2 == 0) {
			for(int i = (half1 + n); i < (half1 + (n*2)); i++) {
				System.out.print(i+" ");
		    }
		    System.out.println();
		}

		for(int i = (half1 - n); i >= 0; i -= (n*2)) {
			for(int j = 1, k = i; j <= n; j++, k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}