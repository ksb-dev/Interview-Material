import java.util.*;

class TestRearrange{

	public int partition(int[] a){

		int pivot = 0;
		int j = 0;
		int k = 0;
		int l = 1;

		for(int i = 0; i < a.length; i++){

			if(a[i] < pivot){

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				j++;
			}
		}

		return j;
	}

	public int[] rearrange(int[] a){

		int p = partition(a);

		for(int n = 0; (p < a.length && n < p); p++, n += 2){

		     int temp = a[n];
		     a[n] = a[p];
		     a[p] = temp;
        }

        return a;
	}
}

public class Rearrange{

	public static void main(String[] args){

		TestRearrange t = new TestRearrange();

		int[] a = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

		System.out.println("Before arrangement : "+Arrays.toString(a)+"\n");

		int[] result = t.rearrange(a);

		System.out.println("After arrangement : "+Arrays.toString(result));
	}
}