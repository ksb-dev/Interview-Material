import java.util.*;

public class BrokenEconomy {
	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 22, 33, 40, 42, 55};
		/*int k = 9;
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == k) {
				r3 = arr[i];
				break;
			}
			if(i >= 1 && k > arr[i -1] && k < arr[i]) {
				r1 = arr[i-1];
				r2 = arr[i];
			}
		}

		System.out.println(r1+" "+r2+" "+r3);*/

		int left = 0;
		int right = arr.length - 1;
		int ceil = 0;
		int floor =  0;

		int data = 25;

		while(left <= right){
		   int mid = (left + right) / 2;
		   if(data > arr[mid]){
			 left = mid + 1;
			 floor = arr[mid];
		   }
		   else if(data < arr[mid]){
			 right = mid - 1;
			 ceil = arr[mid];
		   }
		   else  {
			 floor = arr[mid];
			 ceil = arr[mid];
			 break;
		   }
		}

		System.out.println(floor);
		System.out.println(ceil);
	}
}