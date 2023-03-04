public class SumOfArrayUsingRecursion {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println(sum(arr));
	}

	public static int sum(int input[]) {

		int length = input.length;

        int total = findSum(input, length);

        return total;
	}

    static int findSum(int input[], int length) {

        if (length <= 0)
            return 0;

        return (findSum(input, length - 1) + input[length - 1]);
    }
}