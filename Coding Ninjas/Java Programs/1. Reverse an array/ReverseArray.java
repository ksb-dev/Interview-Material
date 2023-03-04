import java.util.Arrays;

class TestReverseArray{
	public int[] reverse(int[] array){

		int length = array.length;

		//int[] c = new int[array.length];

		for(int i = 0; i < length; i++){

			if(i <= length){
				int temp = array[i];
				array[i] = array[length - 1];
				array[length - 1] = temp;

				length--;
			}

			//c[array.length - j] = array[i];
		}
		return array;
	}
}

public class ReverseArray{
	public static void main(String[] args){
		TestReverseArray tra = new TestReverseArray();

		int[] array = {3, 5, 1, 8, 10};

		int[] result = tra.reverse(array);

		System.out.println(Arrays.toString(result));
	}
}