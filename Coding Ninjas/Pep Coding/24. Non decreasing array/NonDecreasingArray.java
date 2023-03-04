public class NonDecreasingArray {
	public static void main(String[] args) {
		int[] arr = {4, 6, 3, 8, 7, 10};

		int pos = -1;

		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println("i :"+i);
			System.out.println("pos :"+pos);
			if(arr[i] > arr[i+1]) {
				if(pos != -1) {
					System.out.println(false);
					return;
				}
				pos = i;
				System.out.println("pos :"+pos);
			}
		}
		boolean result = pos == 0 || pos == arr.length - 2 || arr[pos - 1] <= arr[pos + 1] || arr[pos] <= arr[pos + 2];
		System.out.println(result);
	}
}