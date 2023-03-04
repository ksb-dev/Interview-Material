import java.util.*;

class TestCommonElements{

	public ArrayList<Integer> commonElements(int[] A, int[] B, int[] C){

		ArrayList<Integer> res = new ArrayList<Integer>();

		int last = Integer.MIN_VALUE;

		int n1 = A.length;
		int n2 = B.length;
	    int n3 = C.length;

	    int i = 0;
	    int j = 0;
	    int k = 0;

		while (i < n1 && j < n2 && k < n3){

		    if (A[i] == B[j] && A[i] == C[k] && A[i] != last){

		         res.add (A[i]);
		         last = A[i];

		         i++;
		         j++;
		         k++;
		    }

		    else if (Math.min (A[i], Math.min(B[j], C[k])) == A[i]) i++;

		    else if (Math.min (A[i], Math.min(B[j], C[k])) == B[j]) j++;

		    else k++;
	    }
        return res;
	}
}

public class CommonElements{

	public static void main(String[] args){

		TestCommonElements t = new TestCommonElements();

		int[] a = {1, 5, 7, 10, 20, 40, 80};
		int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 7, 15, 20, 30, 70, 80};

        /*int[] a = {3, 4, 5};
		int[] b = {3, 4, 5};
		int[] c = {3, 4, 5};*/

		/*int[] a = {3, 3, 5};
		int[] b = {3, 3, 5};
		int[] c = {3, 3, 5};*/

		/*int[] a = {3, 4, 4};
		int[] b = {3, 4, 4};
		int[] c = {3, 4, 4};*/

		/*int[] a = {3, 3, 3};
		int[] b = {3, 3, 3};
		int[] c = {3, 3, 3};*/


		ArrayList<Integer> result = t.commonElements(a, b, c);

		for(int i = 0; i < result.size(); i++){

			System.out.println(result.get(i));
		}

	}
}






/*ArrayList<Integer> g = new ArrayList<>();

		int n1 = ar1.length;
	    int n2 = ar2.length;
	    int n3 = ar3.length;

	    int i = 0;
	    int j = 0;
	    int k = 0;

		while(i < n1 && j < n2 && k < n3){

			if((ar1[i] == ar2[j]) && (ar2[j] == ar3[k])){

				//System.out.println(ar1[i]);

                g.add(ar1[i]);

				i++;
				j++;
				k++;
			}

			else{

				if(ar1[i] < ar2[j]){

					i++;

					continue;
				}

				else if(ar1[i] > ar2[j]){

					j++;

					continue;

				}

				if(ar2[j] < ar3[k]){

					j++;

					continue;

				}

				else if(ar2[j] > ar3[k]){

					k++;

					continue;

				}

			}
        }

        int d = g.get(0);
		int e = g.get(1);
		int f = g.get(2);

		if(d != e && e != f && f != d){

			return g;
		}

		if(d == e && d != f){

			g.remove(e);

			return g;
		}

		if(e == f && e != d){

			g.remove(e);

			return g;
		}

		if(d == e && e == f && f == d){

			g.remove(e);
			g.remove(f);

			return g;
		}


        return g;*/
