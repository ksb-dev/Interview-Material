import java.util.*;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {2, 6, 1, 2};
		int[] arr2 = {1, 2, 3, 4, 2};

		intersection(arr1, arr2);
	}

	public static void intersection(int[] arr1, int[] arr2) {
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


/* Correct intersection



*/


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

*/