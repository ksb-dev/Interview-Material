import java.util.Arrays;

class TestCyclicallyRotate{

	public int[] cyclicallyRotate(int[] a, int n){

		for(int i = 0; i < n; i++){

			int temp = a[a.length - 1];

			for(int j = a.length - 1; j > 0 ; j--){

				a[j] = a[j - 1];
			}

			a[0] = temp;
		}

		return a;
	}
}

public class CyclicallyRotate{

	public static void main(String[] args){

		TestCyclicallyRotate t = new TestCyclicallyRotate();

		int[] a = {3, 5, 6, 2, 4};

		int[] result1 = t.cyclicallyRotate(a, 3);

		System.out.println(Arrays.toString(result1));
	}
}