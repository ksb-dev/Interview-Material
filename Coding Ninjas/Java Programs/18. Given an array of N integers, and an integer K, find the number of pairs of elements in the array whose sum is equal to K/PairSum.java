class TestPairSum{

	public int pairSum(int[] a, int b){

		int count = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				if(a[i] + a[j] == b){

					count++;

			    }
			}
		}
		return count;
	}
}

public class PairSum{

	public static void main(String[] args){

		TestPairSum t = new TestPairSum();

		int[] a = {1, 5, 7, 1, -1};

		int result = t.pairSum(a, 6);

	    System.out.println(result);
	}
}
