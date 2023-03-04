public class FirstAndLastOccuranceOfX {
	public static void main(String[] args) {
		//int[] arr = {-10, -5, -5, -5, 2};
		int[] arr = {1, 2, 3, 4};
		int x = -1;

		int first = -1;
		int last = -1;
		int count = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x && count == 0) {
				first = i;
				count++;
			}

			if(arr[i] == x) {
				last = i;
			}
        }
        System.out.println(first+" "+last);

        /*
        Pair sol = new Pair();
		sol.first = first;
		sol.second = last;
		return sol;
        */
	}
}