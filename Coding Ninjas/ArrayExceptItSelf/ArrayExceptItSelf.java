public class ArrayExceptItSelf {
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4};
		B b = new B();
		int[] result = b.m(a);

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

class B {
	public int[] m(int[] nums){
		int n = nums.length;

		    int[] left_product = new int [n];
		    int [] right_product = new int[n];

		    left_product[0] = 1;
		    right_product[n-1] = 1;

		    int[] output = new int[n];

		    for(int i=1 ; i<n; i++){
		        left_product[i] = nums[i-1] * left_product[i-1];
		        //System.out.println(nums[i-1]);
		        //System.out.println(left_product[i-1]);
		        //System.out.println(left_product[i]);
		    }

		    for(int i=n-2 ; i>=0; i--){
		        right_product[i] = nums[i+1] * right_product[i+1];
		        //System.out.println(nums[i+1]);
		        //System.out.println(right_product[i+1]);
		        //System.out.println(right_product[i]);
		    }

		    for(int i=0;i<n;i++){
		        output[i] = left_product[i] * right_product[i];
		        //System.out.println(left_product[i]);
		        //System.out.println(right_product[i]);
		        //System.out.println(output[i]);
		    }

		    return output;
	}
}