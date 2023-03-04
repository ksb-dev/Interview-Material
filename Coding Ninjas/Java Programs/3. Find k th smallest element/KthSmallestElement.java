import java.util.Arrays;

class TestKthSmallestElement{

	public int kthelement(int[] array, int k){

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
		return array[k-1];
	}
}


public class KthSmallestElement{

	public static void main(String[] args){

		TestKthSmallestElement tra = new TestKthSmallestElement();

		int[] array = {10, 8, 7, 5, 3};

		int result = tra.kthelement(array, 4);

		System.out.println(Arrays.toString(array));

		System.out.println("Minimum Element :"+result);
	}
}