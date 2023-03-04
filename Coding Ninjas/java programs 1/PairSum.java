import java.util.*;

public class PairSum {
	public static void main(String[] args) {
		//int[] a = {1, 2, 3, 4, 5};
		//int n = 5;
		int[] a = { 2, -3, 3, 3, -2};
		int n = 0;
		int[][] result = testPairSum(a, n);

		//for(int i = 0; i < result.length; i++){
			//for(int j = 0; j < result.length; j++){
				//System.out.println(result[i][j]);
			//}
		//}
	}

	static int[][] testPairSum(int[] arr, int n){
		List<int[]> list = new ArrayList();

		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				if(arr[i]+arr[j] == n){
					System.out.println(arr[i]+" "+arr[j]);
					int[] b = new int[2];
					b[0] = arr[i];
					b[1] = arr[j];
					list.add(b);
				}
			}
		}

		int res[][] = new int[list.size()][2];

		for(int i = 0; i < list.size(); i++){
		    int a = list.get(i)[0];
		    int b = list.get(i)[1];
		    res[i][0] = Math.min(a, b);
		    res[i][1] = Math.max(a, b);
        }
        return res;
	}
}