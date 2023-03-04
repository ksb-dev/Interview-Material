import java.util.*;

class ThreeSumZeroArray{

    static List<List<Integer>> threeSum(int[] a) {

		//Arrays.sort(a);

        List<List<Integer>> r = new ArrayList<List<Integer>>();

        ArrayList<Integer> r1 = new ArrayList<>();

        for(int i = 0; i < a.length; i++){

            for(int j = i + 1 ; j < a.length; j++){

				for(int k = j + 1; k < a.length; k++){

					if(a[j] == a[k]){

						continue;
					}

					if(a[i] + a[j] + a[k] == 0){

						r1 = new ArrayList<Integer>();

						r1.add(a[i]);
					    r1.add(a[j]);
						r1.add(a[k]);

						Collections.sort(r1);

						r.add(r1);
					}
				}
            }
        }

		for(int i = 0; i < r.size(); i++){

			for(int j = i + 1; j < r.size(); j++){

				if(r.get(i).equals(r.get(j))){

					r.remove(j);

					j--;
				}
			}
	}

    return r;

    }

    public static void main(String[] args){

		int[] a = {-1,0,1,2,-1,-4};

		//int[] a = {0, 0, 0};

		//int[] a = {0, 0, 0, 0, 0, 0};

		//int[] a = {};

		//int[] a = {0};

		//int[] a = {1, 0, -1};

		//int[] a = {1, -1};

		List<List<Integer>> result = threeSum(a);

		//threeSum(a);

		System.out.println(result);
	}
}