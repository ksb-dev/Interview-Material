import java.util.*;

public class MinimumNumberOfPlatforms {
	public static void main(String[] args) {
		int[] arrival = {900, 940, 950, 1100, 1500, 1800};
		int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

		Arrays.sort(arrival);
		Arrays.sort(departure);

		int train = 0;
		int platform  = 0;
		int i = 0;
		int j = 0;
		int n = arrival.length;

		while(i < n && j < n) {
			if(arrival[i] < departure[j]) {
				train++;
				i++;
			}
			else {
				train--;
				j++;
			}
			platform = Math.max(platform, train);
		}
		System.out.println(platform);
	}
}