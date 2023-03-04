import java.util.*;

public class ArrayIntersection {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j= 0;

        while( i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j]){
                j++;
            }
            else {
                i++;
            }
        }
	}
}

/*

    static void printDistinct(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        System.out.println(hs.size());
    }
    static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
    }

    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);

        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
               System.out.print(arr2[i] + " ");
    }
*/



/* Correct intersection

Arrays.sort(arr1);
Arrays.sort(arr2);

HashMap<Integer, Integer> map = new HashMap<>();
        // Build the frequency map for arr1
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        // Traverse the elements of arr2 one by one
        for (int i = 0; i < arr2.length; i++) {
            // If the map contains current element
            if (map.containsKey(arr2[i])) {
                // Reduce the frequency by 1
                int freq = map.get(arr2[i]);
                freq--;
                // If freq becomes 0, remove the element from the map
                if (freq == 0) {
                    map.remove(arr2[i]);
                } else {
                    map.put(arr2[i], freq);
                }
                // Print the element
                System.out.print(arr2[i] + " ");
            }
        }


*/