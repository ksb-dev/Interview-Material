import java.util.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class MedianUnsortedArrays{

    static double findMedianUnsortedArrays(int[] a, int[] b) {

		DecimalFormat df = new DecimalFormat("0.00000");

		Arrays.sort(a);
		Arrays.sort(b);

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k  =0;

        while(i < a.length && j < b.length){

			if(a[i] < b[j]){

				c[k] = a[i];

				k++;
				i++;
			}
			else{

                c[k] = b[j];

                k++;
                j++;
		    }
		}

		while(i < a.length){

			c[k] = a[i];

			k++;
			i++;
		}

	    while(j < b.length){

			c[k] = b[j];

			k++;
			j++;
		}

		double median = 0;
		int result = 0;

		if(c.length % 2 == 0){

			result = c.length / 2;

		    return median = (c[result] + c[result -1]) / 2.0;

		}

        result = c.length / 2;

        return median = c[result];
    }

    public static void main(String[] args){

		//int[] a = {1, 3};
		//int[] b = {2};

		//int[] a = {5, 8, 9};
		//int[] b = {4, 7, 8};

		int[] a = {1, 2};
		int[] b = {3, 4};

		double result = findMedianUnsortedArrays(a, b);

		System.out.println(result);
	}
}



