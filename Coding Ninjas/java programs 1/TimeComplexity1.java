public class TimeComplexity1 {
	public static void main(String[] args) {
		int n = -2;
		int val1 = 1;
		int val2;

		if(n <= 0) {
			return;
		}

		int remainder = n % 2;
		int[] arr = new int[n];

		if(remainder != 0) {

			int half = ((n-1)/2);

			System.out.println("half :"+half);
			for(int i = 0; i <= half; i++) {
				arr[i] = val1;
				System.out.println(arr[i]);
				val1 += 2;
			}

			val2 = arr[half] - 1;

			for(int j = (half + 1); j < n; j++) {
				arr[j] = val2;
				System.out.println(arr[j]);
				val2 -= 2;
			}
		}
		else {
			int half = ((n-1)/2);

			System.out.println("half :"+half);
			for(int i = 0; i <= half; i++) {
			    arr[i] = val1;
			    System.out.println(arr[i]);
			    val1 += 2;
			}

			val2 = arr[half] + 1;

			for(int j = (half + 1); j < n; j++) {
			    arr[j] = val2;
			    System.out.println(arr[j]);
			    val2 -= 2;
			}
		}
	}
}