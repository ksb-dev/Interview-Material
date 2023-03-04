import java.util.*;

class TestCapacityOfShip{

	public int testCapacityOfShip(int[] a, int d){

		int minCapacity = 0;
	    int sum = 0;
		int result = 0;

		for(int i = 0; i < a.length; i++){

			if(a[i] > minCapacity){

				minCapacity = a[i];
			}

			sum += a[i];
		}

		result = sum / d;

		System.out.println("minCapacity : "+minCapacity);

		System.out.println("sum : "+sum);

		System.out.println("result : "+result);

		System.out.println("-----------------------");

	    return 0;
	}
}

public class CapacityOfShip{

	public static void main(String[] args){

		TestCapacityOfShip t = new TestCapacityOfShip();

		//int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int d = 3;

		int[] a = {3, 2, 2, 4, 1, 4};

		//int[] a = {1, 2, 3, 1, 1};

		int result = t.testCapacityOfShip(a, d);

		System.out.println(result);
	}
}