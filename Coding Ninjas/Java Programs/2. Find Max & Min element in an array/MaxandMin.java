import java.util.Arrays;

class TestMaxandMin{

	public int[] maxandmin(int[] array){

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


public class MaxandMin{

	public static void main(String[] args){

		TestMaxandMin tra = new TestMaxandMin();

		int[] array = {10, 8, 7, 5, 3};

		int[] result = tra.maxandmin(array);

		System.out.println(Arrays.toString(result));

		System.out.println("Minimum Element :"+result[0]);
		System.out.println("Maximun Element :"+result[result.length - 1]);
	}
}