class TestMaximumDistance{

	public int testMaximumDistance(int[] a){

		int count = 0;
		int result = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = 0; j < a.length; j++){

				if(a[i] < a[j]){

					count = j - i;
				}
			}

			if(count > result){

				result = count;
			}
		}

		return result;
	}
}

public class MaximumDistance{

	public static void main(String[] args){

		TestMaximumDistance t = new TestMaximumDistance();

		int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1};

		//int[] a = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};

		//int[] a = {1, 2, 3, 4, 5, 6};

		//int[] a = {6, 5, 4, 3, 2, 1};

		int result = t.testMaximumDistance(a);

		System.out.println(result);
	}
}