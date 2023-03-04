import java.util.*;

public class NearestRepetation {

	public static void main(String[] args) {
		int[] arr = {1, 3, 1, 5, 4, 3};

		int result = minDistance(arr);

		System.out.println(result);
	}

    public static int minDistance(int[] arr){

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

        return minDist;
	}
}