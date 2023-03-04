import java.util.*;

public class NextGreaterElementType1 {

	public static int[] replaceNextGreaterElement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int nge[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			if (!s.empty()) {
				while (!s.empty() && s.peek() <= arr[i]) {
					s.pop();
				}
			}
			nge[i] = s.empty() ? -1 : s.peek();
			s.push(arr[i]);
		}
		//for (int i = 0; i < arr.length; i++)
			//System.out.println(arr[i] + " --> " + nge[i]);

		return nge;
	}
	public static void main(String[] args) {
		int[] arr = {7, 12, 1, 20};
		int[] result = replaceNextGreaterElement(arr);

		System.out.println(Arrays.toString(result));
	}
}

/*
BRUTE FORCE

for(int i = 0; i < arr.length; i++) {
	for(int j = i; j < arr.length; j++) {
		if(arr[j] > arr[i]) {
			arr[i] = arr[j];
			break;
		}
	}
}
arr[arr.length - 1] = -1;

return arr;
*/