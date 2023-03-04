public class MaxElementInArrayUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {1, 10, 3, 18, 34, 2, 20};
		int index = 0;

		System.out.println(maxElement(arr, index));
	}
	public static int maxElement(int[] arr, int index) {
		if(index == arr.length - 1) return arr[index];

		int max = maxElement(arr, index + 1);


		if(max < arr[index]) {
			max = arr[index];
		}
		return max;
	}
}