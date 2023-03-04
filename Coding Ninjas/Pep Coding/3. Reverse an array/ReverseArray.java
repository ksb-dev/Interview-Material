import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		/*int[] result = new int[arr.length];
		int count = 0;

		for(int i = arr.length - 1; i >= 0; i--) {
			result[count] = arr[i];
			count++;
		}*/

		int leftIndex = 0;
		int rightIndex = arr.length - 1;

		while(leftIndex < rightIndex){
		  int temp = arr[leftIndex];
		  arr[leftIndex]= arr[rightIndex];
		  arr[rightIndex] = temp;

		  leftIndex++;
		  rightIndex--;
		}
		System.out.println(Arrays.toString(arr));
	}
}