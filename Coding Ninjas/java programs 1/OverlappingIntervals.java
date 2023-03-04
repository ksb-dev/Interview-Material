public class OverlappingIntervals {
	public static void main(String[] args){
		int[] start = {1, 2, 3};
		int[] end = {2, 3, 4};

		//int[] start = {1, 3};
		//int[] end = {4, 5};

		//int[] start = {2, 1};
		//int[] end = {3, 4};

		boolean result = checkOverlap(start, end);

		System.out.println(result);
	}

	static boolean checkOverlap(int[] start, int[] end) {

		for(int i = 0; i < start.length; i++) {

			for(int j = 0; j < start.length; j++) {

				if(i == j) {
					continue;
				}

				if(start[j] >= start[i] && start[j] < end[i]){
					System.out.println("first "+" "+start[i]+" "+start[j]+" "+end[i]);
				    return true;
                }

                if(start[i] >= start[j] && start[i] < end[j]){
					System.out.println("second "+" "+start[i]+" "+start[j]+" "+end[j]);
				    return true;
                }
		    }
		}
		return false;
	}
}