import java.util.HashMap;

public class LongestSubArraySumDivideByK {

    public static int bruteForce(int a[], int k) {
       int count = 0;
       int maxCount = 0;
       int sum = 0;

       for(int i = 0; i < a.length; i++) {

           count = 0;
           sum = 0;

           for(int j = i; j < a.length; j++) {
               sum += a[j];
               count++;

               if((sum % k) == 0) {

                   //System.out.println(sum + " " + count);

                   if(count >= maxCount) maxCount = count;
               }
           }
       }
       return maxCount;
    }

    public static int optimized(int[] a, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum  = 0;
		int maxLength = 0;

		map.put(0, -1);

		for(int i = 0; i < a.length; i++) {
			sum += a[i];

			int remainder = sum % k;

			if(remainder < 0) {
				remainder += k;
			}

			if(map.containsKey(remainder)) {
				int index = map.get(remainder);
				int length = i - index;

				if(length > maxLength) {
					maxLength = length;
				}
			}
			else {
				map.put(remainder, i);
			}
		}
		return maxLength;
	}

    public static void main(String[] args) {
		int[] arr = {2, 7, 6, 1, 4, 5};
		//int[] arr = {-2, 2, -5, 12, -11, -1, 7};
		int k = 3;

		System.out.println(bruteForce(arr, k));
		System.out.println(optimized(arr, k));
	}
}