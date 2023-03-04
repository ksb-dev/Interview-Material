import java.util.*;

class TestBalanceArray2{

	public int testBalanceArray2(int[] a){

		int sumLeft = 0;
		int sumRight = 0;
		int result = 0;

		for(int i = 0; i < a.length / 2; i++){

			sumLeft += a[i];
		}

		for(int i = a.length / 2; i < a.length; i++){

			sumRight += a[i];
		}

		result = Math.abs(sumLeft - sumRight);

	    return result;
	}
}

public class BalanceArray2{

	public static void main(String[] args){

		TestBalanceArray2 t = new TestBalanceArray2();

		//int[] a = {1, 2, 1, 2, 1, 3};

		int[] a = {1, 2, 5, 2, 4, 2};

		int result = t.testBalanceArray2(a);

		System.out.println(result);
	}
}