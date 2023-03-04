// The politeness of a number is defined as the number of ways it can be expressed as the sum of consecutive integers.

class TestPoliteness {

	public int testPoliteness(int n){

	        return countOddPrimeFactors(n) - 1;
    }
    // A function to count all odd prime factors
    // of a given number n
    public int countOddPrimeFactors(int n){

        int result = 1;

        // Eliminate all even prime
        // factor of number of n
        while (n % 2 == 0){

            n /= 2;

            System.out.println("while-1--n : "+n);
		}

        // n must be odd at this point, so iterate
        // for only odd numbers till sqrt(n)
        for (int i = 3; i * i <= n; i += 2){

            int divCount = 0;

            // if i divides n, then start counting of
            // Odd divisors
            while (n % i == 0){

                n /= i;

                ++divCount;

                System.out.println("while-2--n : "+n);

                System.out.println("divCount : "+divCount);
            }

            result *= divCount + 1;

            System.out.println("result : "+result);
        }
        // If n odd prime still remains then count it
        if (n > 2){

            result *= 2;

            System.out.println("if--result : "+result);
		}

        return result;
    }
}

public class Politeness{

	public static void main(String[] args){

		TestPoliteness t = new TestPoliteness();

	    int result = t.testPoliteness(90);

	    System.out.println(result);
    }
}