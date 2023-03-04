public class CheckNumberInArrayUsingRecursion {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = 4;

		System.out.println(checkNumber(arr, n));
	}

	public static boolean checkNumber(int input[], int x) {

		int length = input.length;

        boolean result =  findNumber(input, length, x);

        return result;
	}

    public static boolean findNumber(int[] input, int length, int x) {
        if(length == 0) {
            return false;
        }
        if(input[length - 1] == x) {
            return true;
        }
        return (findNumber(input, length - 1, x));
    }
}