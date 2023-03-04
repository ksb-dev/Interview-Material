import java.util.*;

public class StockSpan {

	public static void main(String[] args) {
		//int[] price = {100, 80, 60, 70, 60, 75, 85};
		//int[] price = {60, 70, 80, 100, 90, 75, 80, 120};
		int[] price = {10, 10, 10, 10};
		int[] res = stockSpan(price);

		System.out.println(Arrays.toString(res));
	}

	public static int[] stockSpan(int[] price) {
		//Your code goes here
        int[] res = new int[price.length];
        res[0] = 1;

        for(int i = (price.length - 1); i > 0; i--) {
			res[i] = 1;
            int j = i - 1;

            /*System.out.println("i : "+i);
            System.out.println("j : "+j);
            System.out.println("price[i] : "+price[i]);
            System.out.println("price[j] : "+price[j]);*/

            while(j >= 0 && price[i] > price[j]) {
				System.out.println("In while loop");
                res[i]++;
                j--;
            }
            /*for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
                res[i]++;*/
        }
        return res;
	}
}