public class PrintNumbersUsingRecursion {

	public static void main(String[] args) {
		int n = 20;

		print(n);
	}

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
            return;
		}

		print(n - 1);

        System.out.print(n+" ");

        /*if(n > 0) {
            print(n - 1);
            System.out.print(n + " ");
        }
        return;*/
	}
}