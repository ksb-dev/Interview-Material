class TestBalanceArray{

	public int testBalanceArray(int[] a){

		int evenSum = 0;
		int oddSum = 0;

		//long es = 0, os = 0;
        long sum[] = new long[a.length];

		long lefte = 0, lefto = 0;
		int count = 0;

		for(int i = 0; i < a.length; i = i + 2){

			if(a[i] % 2 == 0){

				evenSum += a[i];
			}
			else{

				oddSum += a[i];
			}
		}

		for(int i = 0 ; i < a.length ; i++){

		    if(i%2 == 0){

		        if(oddSum + lefte == lefto + evenSum - a[i])

		            count++;
		            evenSum -= a[i];
		            lefte += a[i];
		    }
		    else{

		       if(evenSum + lefto == lefte + oddSum - a[i])

		            count++;
		            oddSum -= a[i];
		            lefto += a[i];
		    }
        }

		System.out.println("evenSum : "+evenSum);
		System.out.println("oddSum : "+oddSum);

		return count++;
	}
}

public class BalanceArray{

	public static void main(String[] args){

		TestBalanceArray t = new TestBalanceArray();

		int[] a = {2, 1, 6, 4};

        int result = t.testBalanceArray(a);

        System.out.println(result);
	}
}

// Array will be balanced if sum of even index element equal to sum of odd index element.

// A = [5, 5, 2, 5, 8]