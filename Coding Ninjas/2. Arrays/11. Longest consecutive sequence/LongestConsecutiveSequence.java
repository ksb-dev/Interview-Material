import java.util.*;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		//int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		int[] arr = {3, 7, 2, 1, 9, 8, 41};

		HashMap<Integer, Boolean> map= new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();

		for(int key : arr) {
			map.put(key, true);
		}

		for(int key : arr) {
			if(map.containsKey(key - 1)) {
				map.put(key, false);
			}
		}

		int maxStartPoint = 0;
		int maxLength = 0;

		for(int key : arr) {
			if(map.get(key) == true) {
				int tempLength = 1;
				int tempStartPoint = key;

				while(map.containsKey(tempStartPoint + tempLength)) {
					tempLength++;
				}

				if(tempLength > maxLength) {
					maxLength = tempLength;
					maxStartPoint = tempStartPoint;
				}
			}
		}

		for(int i = 0; i < maxLength; i++) {
			System.out.println(maxStartPoint + i);
        }

        System.out.println(maxStartPoint+" "+(maxStartPoint + maxLength - 1));
	}
}