import java.util.*;

public class SubArraySumDivisibleByK {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		int result = subArrayCount(arr, 1);

		System.out.println(result);
	}

    public static int subArrayCount(ArrayList < Integer > arr, int k) {
		/*// Brute Force O(n2);
		int count = 0;

		for(int i = 0; i < arr.size(); i++) {
		    int sum = 0;

		    for(int j = i; j < arr.size(); j++) {
		        sum += arr.get(j);

		        if(sum % k == 0) {
		            count++;
		        }
		     }
		}
        return count;*/

        int count = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);
		int sum = 0;
		int remainder = 0;

		for(int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			remainder = sum % k;

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

        // Using Hashmap O(n)

  	    /*// HashMap to store frequency.
		HashMap < Integer, Integer > remMap = new HashMap < > ();

		// Add base case in hashmap.
		remMap.put(0, 1);

		int count = 0;
		long summ = 0;

		for (int i = 0; i < arr.size(); i++) {
		  summ += arr.get(i);

		  int rem = (int)(((summ % k) + k) % k);

		  // If rem already in 'remMap'.
		  if (remMap.containsKey(rem)) {

			count += remMap.get(rem);
			remMap.put(rem, remMap.get(rem) + 1);
		  }
		  else {

			remMap.put(rem, 1);
		  }
		}

		return count;*/
  }

}