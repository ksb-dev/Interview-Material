import java.util.*;

public class CountThePlatforms {

	public static void main(String[] args) {
		int[] arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

		int count = platformsNeeded(arrival, departure);

		System.out.println(count);
	}

	public static int platformsNeeded(int arrival[], int departure[]){

		Arrays.sort(arrival);

        // sort departure time of trains
        Arrays.sort(departure);

        // maintains the count of trains
        int count = 0;

        // stores minimum platforms needed
        int platforms = 0;

        // take two indices for arrival and departure time
        int i = 0, j = 0;

        // run till all trains have arrived
        while (i < arrival.length)
        {
            // if a train is scheduled to arrive next
            if (arrival[i] < departure[j])
            {
                // increase the count of trains and update minimum
                // platforms if required
                platforms = Integer.max(platforms, ++count);

                // move the pointer to the next arrival
                i++;
            }

            // if the train is scheduled to depart next i.e.
            // `departure[j] < arrival[i]`, decrease trains' count
            // and move pointer `j` to the next departure.

            // If two trains are arriving and departing simultaneously,
            // i.e., `arrival[i] == departure[j]`, depart the train first
            else {
                count--;
                j++;
            }
        }

        return platforms;
	}
}