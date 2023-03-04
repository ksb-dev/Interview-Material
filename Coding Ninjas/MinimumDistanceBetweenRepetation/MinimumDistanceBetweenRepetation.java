import java.util.HashMap;

public class MinimumDistanceBetweenRepetation {
	public static void main(String[] args) {
		//int[] arr = {1, 3, 1, 5, 4, 3};
		int[] arr = {5, 47, 82, 4, 4, 6, 2 };

		HashMap<Integer, Integer> hm = new HashMap<>();
		int minDist = Integer.MAX_VALUE;
		int n = arr.length;

		for(int i = 0; i < n; i++){
			if(hm.containsKey(arr[i])) {
				int currentIndex = i;
				int previousIndex = hm.get(arr[i]);
				minDist = Math.min(minDist, (currentIndex - previousIndex));
			}
			hm.put(arr[i],i);
		}

		if(minDist == Integer.MAX_VALUE) minDist = -1;

        System.out.println(minDist);
	}
}