import java.util.Arrays;

class TestWithoutSort{

	int count = 0;

	public int[] withoutSort(int[] array){

		int[] sort = new int[array.length];

		for(int i = 0; i < array.length; i++){

			if(array[i] == 0){

				sort[count] = array[i];
				count++;
			}
		}

		for(int i = 0; i < array.length; i++){

			if(array[i] == 1){

				sort[count] = array[i];
				count++;
			}
		}

		for(int i = 0; i < array.length; i++){

			if(array[i] == 2){

				sort[count] = array[i];
				count++;
		    }
		}

		return sort;
	}
}

public class WithoutSort{
	public static void main(String[] args){

		TestWithoutSort tra = new TestWithoutSort();

		int[] array = {1, 2, 0, 2, 0, 2, 1};

		int[] result = tra.withoutSort(array);

		System.out.println(Arrays.toString(result));
	}
}