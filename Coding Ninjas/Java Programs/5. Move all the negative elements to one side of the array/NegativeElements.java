import java.util.Arrays;

class TestNegativeElements{
	public int[] negativeElements(int[] array){

		boolean swap = true;

		int length = array.length;

		for(int i = 0; i < length; i++){

			for(int j = 1; j < length; j++){

				if(array[j] < array[j - 1]){

					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;

					swap = false;
				}
			}

			if(swap == true){
				break;
			}
		}
		return array;
	}
}

public class NegativeElements{

	public static void main(String[] args){

		TestNegativeElements tra = new TestNegativeElements();

		int[] array = {-3, 5, 1, -8, 10};

		int[] result = tra.negativeElements(array);

		System.out.println(Arrays.toString(result));
	}
}