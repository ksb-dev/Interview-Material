import java.util.*;

class TwoIndicesEqulasTarget{

    static int[] twoSum(int[] a, int t) {

		if(a.length < 2){

			return null;
		}

        int[] result = new int[2];

        for(int i = 0; i < a.length; i++){

            for(int j = i + 1; j < a.length; j++){

                if(a[i] + a[j] == t && i != j){

                    result[0] = i;
                    result[1] = j;

                }
            }
        }

        return result;
    }

    public static void main(String[] args){

		int[] a = {2,7,11,15};

		//int[] a = {3,2,4};

		//int[] a = {3,3};

		//int[] a = {};

		//int[] a = {4};

		int t = 9;

		int[] result = twoSum(a, t);

		System.out.println(Arrays.toString(result));
	}
}