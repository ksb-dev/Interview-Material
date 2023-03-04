import java.util.ArrayList;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = {3, 12, 34, 2, 0, -1};
		leaders(arr);
	}

	public static void leaders(int[] arr) {

        boolean flag = false;
		ArrayList<Integer> a = new ArrayList<>();
		int leader = 0;
		int last = arr[arr.length-1];

		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i; j < arr.length - 1; j++) {
				if(arr[i] >= arr[j+1]) {
					flag = true;
					leader = arr[i];
				}
				else {
					flag = false;
					leader = 0;
					break;
				}
			}
			if(flag == true) {
				a.add(leader);
			}
		}
		a.add(last);

		for(int i = 0; i < a.size(); i++) {
		    System.out.print(a.get(i) + " ");
        }
	}
}