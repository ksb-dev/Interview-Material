import java.util.*;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {4, 0, 2, 3, 1};
		int k = 3;

		reverse(arr, 0, arr.length - k - 1);

		reverse(arr, arr.length - k, arr.length - 1);

		reverse(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr, int i, int j) {
		int leftIndex = i;
		int rightIndex = j;

		while(leftIndex < rightIndex){
		  int temp = arr[leftIndex];
		  arr[leftIndex]= arr[rightIndex];
		  arr[rightIndex] = temp;

		  leftIndex++;
		  rightIndex--;
		}
	}
}