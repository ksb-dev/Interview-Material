public class SellingStock {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 6, 7};
		int n = values.length;

		if(n <= 1) {
			System.out.println(0);
		}

		long profit = 0L;
		int buyingDay = 0, sellingDay = 1;
		int totalDays = n;

		while(sellingDay < totalDays){
			// If the value of the stock is greater than the buying day, sell the stock
			if(values[sellingDay] > values[buyingDay]) {
				// Add the profit earned by selling the stock.
				profit += (values[sellingDay] - values[buyingDay]);
			}
			buyingDay++;
			sellingDay++;
		}

        System.out.println(profit);
	}
}