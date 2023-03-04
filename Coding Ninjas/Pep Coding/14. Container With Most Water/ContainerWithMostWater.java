public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};

		/*
		// 1. Brute Force

		int water = 0;

		for(int i = 0; i < a.length; i++){

			for(int j = i + 1; j < a.length; j++){

				water = Math.max(water, Math.min(a[i], a[j]) *(j - i));
			}
		}
        System.out.println(water);

        */

        int i = 0;
        int j = a.length - 1;

        int water = 0;

        while(i < j) {
			int width = j - i;
			int height = Math.min(a[i], a[j]);

			water = Math.max(water, width * height);

			if(a[i] < a[j]) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(water);
	}
}