import java.util.*;

class ThreeSumClosest {

    public static int bruteForce(int[] arr, int target) {

	   int closest = Integer.MAX_VALUE;

	   for (int i = 0; i < arr.length; i++) {

		   for (int j = i + 1; j < arr.length; j++) {

			   for (int k = j + 1; k < arr.length; k++) {

				   int sum = arr[i] + arr[j] + arr[k];

				   if (Math.abs(target - sum) < Math.abs(target - closest)) {
					   closest = sum;
				   }
			   }
		   }
	   }
       return closest;
    }

    public static int better(int[] arr, int target) {
		int answer = arr[0] + arr[1] + arr[arr.length - 1];

		Arrays.sort(arr);

		int closest = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length; i++){

			int j = i + 1;
			int k = arr.length - 1;

			while(j < k){

				int sum = arr[i] + arr[j] + arr[k];

				if(target == sum) {

					return sum;

				} else if(sum < target){

					if(Math.abs(target - sum) < closest){

						answer = sum;

						closest = Math.abs(target - sum);
					}

					j++;

				} else {

					if(Math.abs(target - sum) <= closest){

						answer = sum;

						closest = Math.abs(target - sum);
					}
					k--;
				}
			}
		}
        return answer;
	}

    public static void main(String[] args) {
		int[] arr = {5,2,7,5};
		int target = 13;

		//int[] arr = {-1, 2, 1, -4};
		//int target = 1;

		//int[] arr = {0, 0, 0};
		//int target = 1;

		//List<List<Integer>> result1 = bruteForce(arr);

		System.out.println(bruteForce(arr, target));
		System.out.println(better(arr, target));
	}
}