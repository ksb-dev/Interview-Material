public class FindFirstIndexOfGivenElementInArrayUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {9, 8, 9, 8};
		int x = 10;

		System.out.println(firstIndex(arr, x));
	}

	public static int firstIndex(int input[], int x) {
		return findIndex(input, x, 0);
	}

    public static int findIndex(int[] input, int x, int startIndex) {

		if(startIndex > input.length - 1) {
			return - 1;
		}

		if(input[startIndex] == x) {
			return startIndex;
		}

		return findIndex(input, x, startIndex + 1);
    }
}