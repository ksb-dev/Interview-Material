import java.util.HashMap;

public class SubArraySumsDivisibleByK {

    public static int bruteForce(int[] a, int k) {
       int count = 0;

       for(int i = 0; i < a.length; i++) {
           int sum = 0;

           for(int j = i; j < a.length; j++) {
               sum += a[j];

               if((sum % k) == 0) {
                   count++;
               }
           }
       }
       return count;
    }

    public static int optimized (int[] a, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int sum = 0;

		map.put(0, 1);

		for(int i = 0; i < a.length; i++) {
			sum += a[i];

			int remainder = sum % k;

			if(remainder < 0) {
				remainder += k;
			}

			if(map.containsKey(remainder)) {
				count += map.get(remainder);
				map.put(remainder, map.get(remainder) + 1);
			}
			else {
				map.put(remainder, 1);
			}
		}
		return count;
	}

    public static void main(String[] args) {
		int[] arr = {4,5,0,-2,-3,1};
		int k = 5;
		//int[] arr = {5, 0, 2, 3, 1};
		//int k = 5;

		System.out.println(bruteForce(arr, k));
		System.out.println(optimized(arr, k));
	}
}