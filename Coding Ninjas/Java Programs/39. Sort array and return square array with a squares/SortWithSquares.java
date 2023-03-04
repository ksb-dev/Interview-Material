import java.util.*;

class TestSortWithSquares{

	public int[] testSortWithSquares(int[] a){

		for(int i = 0; i < a.length; i++){

			a[i] = a[i] * a[i];

		}

		Arrays.sort(a);

		return a;
	}
}

public class SortWithSquares{

	public static void main(String[] args){

		TestSortWithSquares t = new TestSortWithSquares();

		//int[] a = {-6, -3, -1, 2, 4, 5};

		int[] a = {-5, -4, -2, 0, 1};

		int[] result = t.testSortWithSquares(a);

		System.out.println(Arrays.toString(a));
	}
}