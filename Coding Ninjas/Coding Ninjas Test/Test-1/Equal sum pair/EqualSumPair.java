import java.util.*;

public class EqualSumPair{

    static class pair {
        int first;
        int second;

        pair(int f,int s) {
            first = f;
            second = s;
        }
    }

    public static void main(String[] args) {
		int[] arr = {9, 8, 7, 10, 20, 30};
		boolean result = findPairs(arr);

		System.out.println(result);
	}

	public static boolean findPairs(int[] arr){


        HashMap<Integer, pair> map = new HashMap<Integer, pair>();
        int n = arr.length;

        // Traverse through all possible pairs of arr[]
        for (int i = 0; i < n; ++i) {

            for (int j = i + 1; j < n; ++j) {

                int sum = arr[i] + arr[j];

                if (!map.containsKey(sum))
                    map.put(sum, new pair(i,j));

                else {
                    pair p = map.get(sum);

                    return true;
                }
            }
        }
        return false;
    }
}