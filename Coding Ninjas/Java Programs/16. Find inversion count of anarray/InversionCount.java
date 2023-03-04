class TestInversionCount{

	public int inversionCount(int[] a){

		int count = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				if(a[i] > a[j]){

					count++;
				}
			}
		}

		return count;
	}
}

public class InversionCount{

	public static void main(String[] args){

		TestInversionCount t = new TestInversionCount();

		int[] a = {2, 4, 1, 3, 5};

		int result = t.inversionCount(a);

		System.out.println(result);
	}
}