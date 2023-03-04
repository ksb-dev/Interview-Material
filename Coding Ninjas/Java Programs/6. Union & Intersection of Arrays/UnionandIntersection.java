import java.util.Arrays;

class TestUnionandIntersection{

	public int[] union(int[] a, int[] b){

		int i = 0;
		int j = 0;
		int count = 0;

		int[] c = new int[a.length + b.length];

		while(i < a.length && j < b.length){

			if(a[i] < b[j]){

				c[count] = a[i];

				i++;
				count++;
			}
			else if(b[j] < a[i]){

				c[count] = b[j];

				j++;
				count++;
			}
			else{

				c[count] = a[i];
				i++;
				j++;
				count++;
			}
		}

		while(i < a.length){

			c[count] = a[i];

			i++;
			count++;
		}

		while(j < b.length){

			c[count] = b[j];

			j++;
			count++;
		}

		return c;
	}



	public int[] intersection(int[] a, int[] b){

		int i = 0;
		int j = 0;
		int count = 0;

		int[] d = new int[a.length + b.length];

		while(i < a.length && j < b.length){

			if(a[i] < b[j]){

				i++;
				count++;
			}
			else if(b[j] < a[i]){

				j++;
				count++;
			}
			else{

				d[count] = a[i];

				i++;
				j++;
				count++;
			}
		}

		return d;
	}
}

public class UnionandIntersection{

	public static void main(String[] args){

		TestUnionandIntersection t = new TestUnionandIntersection();

		int[] a = {1, 2, 4, 6, 8};
		int[] b = {2, 6, 7, 8};

		int[] union = t.union(a, b);
		int[] intersection = t.intersection(a, b);

		System.out.println("First array :" + Arrays.toString(a)+"\n");
		System.out.println("Second array :" + Arrays.toString(b)+"\n");

		System.out.println("---------------------\n");

		System.out.println("Union of array\n");

		for(int i = 0; i < union.length; i++){

			if(union[i] != 0){

			   System.out.println(union[i]);
	       }
	    }

	    System.out.println("---------------------\n");


        System.out.println("Intersection of array\n");

	    for(int i = 0; i < intersection.length; i++){

			if(intersection[i] != 0){

				System.out.println(intersection[i]);
			}
	    }
	}
}


