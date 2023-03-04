class TestDuplicates{

	public int[] duplicates(int[] a){

		int[] b = new int[a.length];

		int count = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				if(a[i] == a[j]){

					b[count] = a[i];

					count++;
				}
			}
		}
		return b;
	}
}

public class Duplicates{

	public static void main(String[] args){

		TestDuplicates t = new TestDuplicates();

		int[] a = {2, 8, 5, 7, 8, 1, 2, 3, 3};

		int[] result = t.duplicates(a);

		for(int i = 0; i < result.length; i++){

			if(result[i] != 0){

				System.out.println(result[i]);
			}
		}
	}
}