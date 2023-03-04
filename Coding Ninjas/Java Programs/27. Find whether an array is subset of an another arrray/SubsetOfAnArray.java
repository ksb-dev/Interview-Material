class TestSubsetOfAnArray{

	public String subsetOfAnArray(int[] a, int[] b){

		int count = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = 0; j < b.length; j++){

				System.out.println("a[i] : "+a[i]+" b[j] : "+b[j]);

				if(a[i] == b[j]){

					count++;
				}

				System.out.println("count : "+count);

				if(count == b.length){

					System.out.println("In Count");

					return "Yes";
				}
			}
		}

		return "No";
	}
}

public class SubsetOfAnArray{

	public static void main(String[] args){

		TestSubsetOfAnArray t = new TestSubsetOfAnArray();

		//int[] a = {11, 1, 13, 21, 3, 7, 5};

		//int[] b = {11, 3, 7, 1, 5};

		int[] a = {7, 5, 1, 2, 445};

		int[] b = {1, 2};

		String result = t.subsetOfAnArray(a, b);

		System.out.println(result);
	}
}