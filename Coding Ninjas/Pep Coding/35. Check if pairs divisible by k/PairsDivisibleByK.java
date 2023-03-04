import java.util.*;

public class PairsDivisibleByK {
	public static void main(String[] args) {
		int[] arr = {8, 7, 5, 0};
		int k = 4;

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; i++) {
			int remainder = arr[i] % k;

			int oldFrequency = map.getOrDefault(remainder, 0);
			map.put(remainder, oldFrequency + 1);
		}

		System.out.println(map);

		for(int i = 0; i < arr.length; i++) {
			int remainder = arr[i] % k;

			System.out.println("remainder : "+remainder);

			if(remainder == 0) {
				int frequency = map.get(remainder);

				if(frequency % 2 == 1) {
					System.out.println(false);
					return;
				}
			}
			else if (2 * remainder == k) {
				int frequency = map.get(remainder);

				if(frequency % 2 == 1) {
					System.out.println(false);
					return;
				}
			}
			else {
				int frequency1 = map.get(remainder);
				int frequency2 = map.getOrDefault(k - remainder, 0);

				System.out.println("frequency1 : "+frequency1);
				System.out.println("frequency2 : "+frequency2);

				if(frequency1 != frequency2) {
					System.out.println(false);
					return;
				}
			}
			System.out.println("-----------------");
		}
		System.out.println(true);
	}
}