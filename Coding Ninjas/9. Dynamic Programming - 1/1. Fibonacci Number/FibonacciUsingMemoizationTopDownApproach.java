public class FibonacciUsingMemoizationTopDownApproach {

	public static int fibRecursion(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	public static int fibMemoization(int n){

		int storage[] = new int[n + 1];
		for(int i = 0; i <= n; i++){
			storage[i] = -1;
		}
		return fibMemoization(n, storage);

	}

	public static int fibMemoization(int n, int storage[]){
		if(n == 0 || n == 1){
			storage[n] = n;
			return storage[n];
		}
		if(storage[n] != -1){
			return storage[n];
		}

		storage[n] =  fibMemoization(n - 1, storage) + fibMemoization(n - 2, storage);
		return storage[n];
	}

	public static int fibDynamicProgramming(int n) {
		int[] storage = new int[n + 1];
		storage[0] = 0;
		storage[1] = 1;

		for(int i = 2; i <= n; i++) {
			storage[i] = storage[i - 2] + storage[i - 1];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		int n = 44;
		System.out.println("Dynamic Programming : "+fibDynamicProgramming(n));
		System.out.println("Memoization : "+fibMemoization(n));
		System.out.println("Recursion : "+fibRecursion(n));
	}

}