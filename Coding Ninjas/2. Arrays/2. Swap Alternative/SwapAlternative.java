import java.util.*;

public class SwapAlternative {

	public static void main(String[] args) {
		int[] arr = {9, 3, 6, 12, 4, 32, 5, 11, 19};

		swapAlternate(arr);
	}

    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        if(arr.length == 0) {
            return;
        }

        for(int i = 0; i < arr.length - 1; i += 2) {
			int temp = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));
    }
}