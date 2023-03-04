import java.util.*;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int[] arr = {9, 9, 9, 9, 9, 9};
		int n = arr.length;

		Arrays.sort(arr);

		for(int i = n -1 ; i > 0; i--) {
			if(arr[i] > arr[i - 1]) {
				System.out.println(arr[i - 1]);
				return;
			}
		}
        System.out.println(-1);
	}
}