// Return true if you can form non-degenerated triangle.

import java.util.*;

public class FormATriangle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		boolean result = false;
		list.add(12);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(28);

		/*list.add(12);
		list.add(7);
		list.add(9);
		list.add(20);*/

		System.out.println(list);

		if (list.size() < 3)
		  result = false;

		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);

		Arrays.sort(array);

		for (int i = 0; i < array.length - 2; i++)

			if (array[i] + array[i + 1] > array[i + 2])
				result = true;

        System.out.println(result);
	}
}