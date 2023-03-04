import java.util.*;

class TestNobleInteger{

	public int testNobleInteger(int[] a){

		Arrays.sort(a);

		for(int i = 0; i < a.length -1 ; i++){

			if(a[i] == a[i + 1]){

				continue;
			}

			if(a[i] == a.length - i - 1){

				return a[i];
			}
		}

		/*Arrays.sort(a);

		System.out.println(Arrays.toString(a)+"\n");

		int count1 = 0;
		int count2 = 0;

		for(int i = 0; i < a.length; i++){

			count1 = 0;

			for(int j = i + 1; j < a.length; j++){

				//System.out.println("a[i] : "+a[i]+" a[j] : "+a[j]);

				if(a[i] < a[j] && a[j] != a[j - 1]){

				//if(a[i] < a[j]){


					count1++;

					//System.out.println("count1 "+count1);
				}
			}

			if(Math.abs(a[i]) == count1){

				count2 = count1;

				System.out.println("Noble Integer : "+a[i]+"\n");

				//break;
			}
		}

		return count2;*/

		return -1;
	}
}

public class NobleInteger{

	public static void main(String[] args){

		TestNobleInteger t = new TestNobleInteger();

		//int[] a = {3, 2, 1, 3};

		//int[] a = {1, 1, 3, 3};

		//int[] a = {7, 3, 16, 10};

		//int[] a = {-1, -9, -2, -78, 0};

		//int[] a = {-4, -2, 0, -1, -6};

		//int[] a = {-1, -2, 0, 0, 0, -3};

		int[] a = { 4, -9, 8, 5, -1, 7, 5, 3};

		int result = t.testNobleInteger(a);

		System.out.println(result);
	}
}



/*
		        int size = arr.length;
		        for (int i = 0; i < size; i++ )
		        {
		            int count = 0;
		            for (int j = 0; j < size; j++)
		                if (arr[i] < arr[j])
		                    count++;

		            // If count of greater elements
		            // is equal to arr[i]
		            if (count == arr[i])
		                return arr[i];
		        }
        return -1;
*/