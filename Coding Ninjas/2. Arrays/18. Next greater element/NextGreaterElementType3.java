import java.util.*;

class NextGreaterElementType3 {

    public static int[] nextGreaterElement(int[] brr, int[] arr) {
        Stack<Integer>s=new Stack<>();
		Map<Integer,Integer>map = new HashMap<>();

		s.push(-1);

		int n = arr.length;

		for(int i = n - 1 ;i >= 0; i--){
			while(s.peek()!= -1 && s.peek() <= arr[i]) s.pop();
			map.put(arr[i],s.peek());
			s.push(arr[i]);
		}
		int[]ans = new int[brr.length];

		for(int i = 0; i < brr.length; i++){
			ans[i] = map.get(brr[i]);
		}
        return ans;
    }

    public static void main(String[] args) {
		int[] arr1 = {4, 1, 2};
		int[] arr2 = {1, 3, 4, 2};

		//int[] arr1 = {4, 1, 2};
		//int[] arr2 = {1, 2, 3, 4};

		int[] result = nextGreaterElement(arr1, arr2);

		System.out.println(Arrays.toString(result));
    }
}