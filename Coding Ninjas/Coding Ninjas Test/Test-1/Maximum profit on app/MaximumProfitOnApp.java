import java.util.*;

public class MaximumProfitOnApp {
	public static void main(String[] args) {
		int[] arr = {30, 20, 53, 14};

		Arrays.sort(arr);

		int maximum = 0;

		for(int i = 0; i < arr.length; i++){
			maximum = Math.max(maximum, (arr[i] * (arr.length - i)));
		}
		System.out.println(maximum);
	}
}