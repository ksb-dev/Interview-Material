class TestFindElementInMatrix{

	public boolean testFindElementInMatrix(int[][] a, int target){

		int result = 0;
		int count = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = 0; j < a[i].length; j++){

				if(a[i][j] == target){

					count++;

					result = a[i][j];

					System.out.println(result);

					break;
				}
			}
		}

		if(count > 0){

			return true;
		}
		return false;
	}
}

public class FindElementInMatrix{

	public static void main(String[] args){

		TestFindElementInMatrix t = new TestFindElementInMatrix();

		//int[][] a = {{1, 3, 5, 7},{10, 11, 16,20},{23, 30, 34,60}};

		int[][] a = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};

		int target = 5;

		boolean result = t.testFindElementInMatrix(a, target);

		System.out.println(result);
	}
}