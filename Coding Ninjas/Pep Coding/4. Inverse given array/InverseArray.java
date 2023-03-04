import java.util.*;

public class InverseArray {
	public static void main(String[] args) {
		int[] arr = {4, 0, 2, 3, 1};

		int[] inverse = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {
			int value = arr[i];
			inverse[value] = i;
		}

		System.out.println(Arrays.toString(inverse));
	}
}