import java.util.*;

public class Array012 {
	   public static void swap(int[] arr, int i, int j){
		   System.out.println("i : "+i+", j : "+j);
	       int temp = arr[i];
	       arr[i]= arr[j];
	       arr[j]= temp;

	       System.out.println(Arrays.toString(arr));
	   }

	   public static void main(String[] args) {
	       //Write your code here
	       int[] arr = {1,0,2,0,1,2,0,1};
	       int low = 0;
	       int mid = 0;
	       int high = arr.length - 1;

	       while(mid <= high){

	           if(arr[mid] == 0){
	               swap(arr,mid,low);
	               low++;
	               mid++;
	           }
	           else if(arr[mid] == 1){
	               mid++;
	           }
	           else if(arr[mid] == 2){
	               swap(arr,high,mid);
	               high--;
	           }
	       }
	       System.out.println(Arrays.toString(arr));
    }
}