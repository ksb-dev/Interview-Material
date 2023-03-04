import java.util.*;

public class FindMissingInSecondArray {

    public static ArrayList<Long> optimal(long[] arr1, long[] arr2) {

        HashMap<Long, Integer> map = new HashMap<>();
        ArrayList<Long> list = new ArrayList<>();

        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        for(int i = 0; i < arr1.length; i++) {
            if(!map.containsKey(arr1[i])) {
                list.add(arr1[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
		long[] arr1 = {1, 2, 3, 4, 5, 10};
		long[] arr2 = {2, 3, 1, 0, 5};

		System.out.println(optimal(arr1, arr2));
	}
}