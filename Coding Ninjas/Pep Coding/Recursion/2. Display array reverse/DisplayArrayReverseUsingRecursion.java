public class DisplayArrayReverseUsingRecursion {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int index = arr.length - 1;
		display(arr, index);
	}
	public static void display(int[] arr, int index) {
		if(index < 0) return;

		System.out.println(arr[index]);

		display(arr, index - 1);
	}
}