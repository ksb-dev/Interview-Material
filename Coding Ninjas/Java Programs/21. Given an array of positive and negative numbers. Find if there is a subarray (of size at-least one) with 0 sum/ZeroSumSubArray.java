class TestZeroSumSubArray{

	public boolean zeroSumSubArray(int[] a){

		if(a.length >= 1){

			for(int i = 0; i < a.length; i++){

				int sum = 0;

				for(int j = i; j < a.length; j++){

					sum = sum + a[j];

					if(a[j] == 0 || sum == 0){

						return true;
					}
			     }
		    }
		}

		return false;
	}
}

public class ZeroSumSubArray{

	public static void main(String[] args){

		TestZeroSumSubArray t = new TestZeroSumSubArray();

		int[] a = {4, 2, -3, 1, 6};

		//int[] a = {4, 2, 0, 1, 6};

		//int[] a = {1};

		boolean result = t.zeroSumSubArray(a);

		//t.zeroSumSubArray(a);

		System.out.println(result);
	}
}