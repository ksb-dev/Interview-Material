class TestMinimumJumps{

	public int minimumJumps(int[] a){

		  if (a.length <= 1){

			  return 0;
		  }


		  // Return -1 if not possible to jump

		  if (a[0] == 0){

			  return -1;
		  }


		  // initialization

		  int maxReachIndex = a[0];
		  int steps = a[0];
		  int jump = 1;


		  // Start traversing array

		  for (int i = 1; i < a.length; i++){

		      // Check if we have reached the end of the array

		       if (i == a.length - 1){

		           return jump;
			   }

		      // updating maxReach

		       maxReachIndex = Math.max(maxReachIndex, i + a[i]);

		       System.out.println("maxReachIndex :"+maxReachIndex);

		       // we use a step to get to the current index

		       steps--;

		       System.out.println("steps :"+steps);

		       // If no further steps left

		       if (steps == 0){

		       //  we must have used a jump

		            jump++;

		                //Check if the current index/position  or lesser index
		                // is the maximum reach point from the previous indexes

		                //if(i >= maxReach)
		                   //return -1;

		                // re-initialize the steps to the amount
		                // of steps to reach maxReach from position i.

		                steps = maxReachIndex - i;

		           System.out.println("steps :"+steps);
		       }
		  }
          return jump;
	}
}

public class MinimumJumps{

	public static void main(String[] args){

		TestMinimumJumps t = new TestMinimumJumps();

		int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

		//int[] a = {3, 4, 3, 2, 6, 7};

		int result = t.minimumJumps(a);

		System.out.println("Minimum jumps required to reach end of an array is :"+ result);
	}
}