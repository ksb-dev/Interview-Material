import java.util.*;

public class FindAllIndicesOfGivenElementInArrayUsingRecursion {

	public static void main(String[] args) {

		int[] arr = {9, 8, 9, 8, 8};
		int x = 8;

		System.out.println(Arrays.toString(allIndexes(arr, x)));
	}

    public static int[] allIndexes(int input[], int x) {

		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		ArrayList<Integer> result = findIndex(input, x, 0, list, count);

		int[] finalResult = new int[result.size()];

		for (int i=0; i < finalResult.length; i++) {
			finalResult[i] = result.get(i).intValue();
		}

		return finalResult;
	}


	public static ArrayList<Integer> findIndex(int[] input, int x,int startIndex, ArrayList<Integer> list, int count) {
		if(startIndex > input.length - 1) {
			return list;
		}

		if(startIndex <= input.length - 1 && input[startIndex] == x) {
			list.add(startIndex);
		}

		return findIndex(input, x, startIndex + 1, list, count);
    }
}