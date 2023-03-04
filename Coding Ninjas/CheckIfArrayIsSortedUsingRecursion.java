public class CheckIfArrayIsSortedUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println(checkSorted(arr));
	}

	public static boolean checkSorted(int[] arr) {
		return checkSorted(arr, 0);
	}

	public static boolean checkSorted(int[] arr, int startIndex) {
		if(startIndex >= arr.length - 1) {
			return true;
		}
		if(arr[startIndex] > arr[startIndex + 1]) {
			return false;
		}
		return checkSorted(arr, startIndex + 1);
	}
}