public class PrintNumberOfDigitsUsingRecursion {

	public static void main(String[] args) {
		int n = 20;

		System.out.println(count(n));
	}

	public static int count(int n){
		if(n / 10 == 0){
			return 1;
		}

		int smallAns = count(n / 10);

		return smallAns + 1;


        /*

        int c = 0;

        while (n != 0) {
            n = n / 10;
            ++c;
        }

        return c;

        */


        /*

        if (n/10 == 0)
            return 1;

        return 1 + count(n / 10);

        */
	}
}