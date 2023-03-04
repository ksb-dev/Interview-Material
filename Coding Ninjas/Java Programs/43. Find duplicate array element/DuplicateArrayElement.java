import java.util.*;

class TestDuplicateArrayElement{

	public int[] testDuplicateArrayElement(int[] a){

		int[] result = new int[a.length];

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				if(a[i] == a[j]){

					result[i] = a[i];
				}
			}
		}

		return result;
	}
}

public class DuplicateArrayElement{

	public static void main(String[] args){

		TestDuplicateArrayElement t = new TestDuplicateArrayElement();

		int[] a = {1, 2, 3, 6, 3, 6, 1};

		int[] result = t.testDuplicateArrayElement(a);

		for(int i = 0; i < result.length; i++){

			if(result[i] != 0){

				System.out.println(result[i]);
			}
		}
	}
}