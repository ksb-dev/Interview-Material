public class BarChart {
	public static void main(String[] args) {
		int[] arr = {5, 0, 2, 1, 3, 0, 6};
		int n = arr.length;

		int max = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
		   max = Math.max(max, arr[i]);
		}

		for(int i = 0; i < max; i++){
		   for(int val: arr){
			 if(val >= max - i){
				System.out.print("*");
			 } else {
				System.out.print(" ");
			 }
		   }

		   System.out.println();
        }
	}
}