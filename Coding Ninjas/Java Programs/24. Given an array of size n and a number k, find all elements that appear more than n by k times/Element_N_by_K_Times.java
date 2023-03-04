import java.util.*;

class TestElement_N_by_k_Times{

	public ArrayList<Integer> NbyKtimes(int[] a, int k){

	    int m = (a.length / k);

		ArrayList<Integer> result = new ArrayList<>();

		for(int i = 0; i < a.length; i++){

			int count1 = 1;

			for(int j = i + 1; j < a.length; j++){

				if(a[i] == a[j]){

					count1++;

					if(count1 > m && (!result.contains(a[i]))){

						result.add(a[i]);
					}
				}
			}
		}

		return result;
	}
}

public class Element_N_by_K_Times{

	public static void main(String[] args){

		TestElement_N_by_k_Times t = new TestElement_N_by_k_Times();

		//int[] a = {3, 1, 2, 2, 1, 2, 3, 3};

		//int[] a = {2, 2, 4, 4, 3, 5, 3, 4, 4, 6, 4, 3, 3, 8};

		int[] a = {1, 3, 4, 7, 4, 7, 5};

		ArrayList<Integer> result = t.NbyKtimes(a, 6);

		System.out.println(result);
	}
}
