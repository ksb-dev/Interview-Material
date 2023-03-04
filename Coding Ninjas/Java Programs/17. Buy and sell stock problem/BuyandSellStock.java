class TestBuyandSellStock{

	public int buyandSellStock(int[] a){

		int result1 = 0;
		int result2 = 0;

		for(int i = 0; i < a.length; i++){

		    for(int j = i+1; j < a.length; j++){

				if(a[i] < a[j]){

				    System.out.println("a[i] : "+a[i]+" a[j] : "+a[j]);

		            result1 = a[j] - a[i];

		            System.out.println("result1 : "+result1);

		            if(result1 > result2){

		               result2 = result1;
		            }
			    }
		    }
	     }

		return result2;
	}
}

public class BuyandSellStock{

	public static void main(String[] args){

		TestBuyandSellStock t = new TestBuyandSellStock();

		//int[] a = {7, 1, 5, 10, 8, 4};

		//int[] a = {7,1,5,3,6,4};

		int[] a = {7,1,7,3,0,4};

		int result = t.buyandSellStock(a);

		System.out.println(result);
	}
}
















		/*int small = a[0];
		int index = 0;

		for(int i = 1; i < a.length - 1; i++){

			if(a[i] < small){

				small = a[i];

				index = i + 1;
			}
		}

		int big = a[index];

		for(int j = index; j < a.length - 1; j++){

			if(a[j] > big){

				big = a[j];
			}
		}

		return (big - small);*/