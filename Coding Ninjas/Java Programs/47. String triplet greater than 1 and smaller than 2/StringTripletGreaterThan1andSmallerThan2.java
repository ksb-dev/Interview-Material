import java.util.*;

public class StringTripletGreaterThan1andSmallerThan2{

    static int solve(String[] a) {

        double[] b = new double[a.length];

        double sum1 = 0;
        double sum2 = 0;
        int count = 0;

        for(int i=0; i< a.length; i++) {

             b[i] = Double.parseDouble(a[i]);
        }

        Arrays.sort(b);

        //System.out.println(Arrays.toString(b));

        for(int i = 0; i < b.length; i++){

			sum1 = 0;
			count = 0;

            for(int j =  i + 1; j < b.length - 1; j++){

				sum1 = 0;
				count = 0;

                sum1 += b[i] + b[j] + b[j+1];

                count++;

                //System.out.println("count : "+count);
                //System.out.println("sum1 : "+sum1);

                if(sum1 > 1 && sum1 < 2 && count == 1){

                    sum2 = sum1;

                    //System.out.println("sum2 : "+sum1);

                    return 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args){

		//String[] s = { "2.673662", "2.419159", "0.573816", "2.454376", "0.403605", "2.503658", "0.806191"};

		//String[] s = {"0.503094", "0.648924", "0.999298"};

		String[] s = {"0.366507", "0.234601", "2.126313", "1.372403", "2.022170", "0.308558", "2.120754", "1.561462"};

		int result = solve(s);

		System.out.println(result);
    }
}