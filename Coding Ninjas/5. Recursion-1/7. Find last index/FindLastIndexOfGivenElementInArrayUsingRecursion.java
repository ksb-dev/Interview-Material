public class FindLastIndexOfGivenElementInArrayUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {9, 8, 9, 8};
		int x = 8;

		System.out.println(lastIndex(arr, x));
	}

	public static int lastIndex(int input[], int x) {
		return findIndex(input, x, input.length - 1);
	}

    public static int findIndex(int[] input, int x, int lastIndex) {

		if(lastIndex < 0) {
			return - 1;
		}

		if(lastIndex >= 0 && input[lastIndex] == x) {
			return lastIndex;
		}

		return findIndex(input, x, lastIndex - 1);
    }
}