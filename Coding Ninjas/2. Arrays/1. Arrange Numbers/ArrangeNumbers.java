import java.util.*;

public class ArrangeNumbers {

	public static void main(String[] args) {
		int[] arr = new int[9];
		int n = 9;

		arrange(arr, n);
	}

    public static void arrange(int[] arr, int n) {
    	//Your code goes here
		int val1 = 1;
		int val2;

        if(n <= 0) {
            return;
        }

        int remainder = n % 2;

		if(remainder != 0) {

			int half = ((n-1)/2);

			for(int i = 0; i <= half; i++) {
				arr[i] = val1;
				val1 += 2;
			}

			val2 = arr[half] - 1;

			for(int j = (half + 1); j < n; j++) {
				arr[j] = val2;
				val2 -= 2;
			}
		}
		else {
			int half = ((n-1)/2);

			for(int i = 0; i <= half; i++) {
			    arr[i] = val1;
			    val1 += 2;
			}

			val2 = arr[half] + 1;

			for(int j = (half + 1); j < n; j++) {
			    arr[j] = val2;
			    val2 -= 2;
			}
		}

		System.out.println(Arrays.toString(arr));
    }
}