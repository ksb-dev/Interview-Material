import java.util.*;

public class PushZeroesToEnd {
	public static void main(String[] args) {
		int[] arr = {0, 5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0 };
		int count = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println("count : "+count+" arr[i] : "+arr[i]);
				arr[count++] = arr[i];
			}
		}

		System.out.println(Arrays.toString(arr));

		while(count < arr.length) {
			arr[count++] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}
}