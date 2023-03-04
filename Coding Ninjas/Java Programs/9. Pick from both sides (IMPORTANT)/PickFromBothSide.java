import java.util.*;

class TestPickFromBothSide{

	public int pickFromBothSide(int[] a, int b){

		int sum1 = 0;
		int sum2 = 0;
		int min1 = 0;

		for(int i = 0; i < a.length; i++){ // {5, -2, 3 , 1, 2}

			sum1 += a[i];
		}

        int i = 0;
		int j = a.length - b;

		for(int k = i; k < j ; k++){

			sum2 += a[k];
		}

		min1 = sum2;

		i++;

		System.out.println("sum1 :"+sum1+" sum2 :"+sum2+" min1 :"+min1);

		while(j < a.length){

			sum2 += (a[j] - a[i - 1]);
			min1 = Math.min(sum2, min1);

			System.out.println(" sum2 :"+sum2+" min1 :"+min1);

		    i++;
		    j++;
		}

		return (sum1 - min1);
	}
}

public class PickFromBothSide{

	public static void main(String[] args){

		TestPickFromBothSide p = new TestPickFromBothSide();

		int[] a = {5, -2, 3 , 1, 2};

		//p.pickFromBothSide(a, 2);

		int result = p.pickFromBothSide(a, 2);

		System.out.println(result);
	}
}