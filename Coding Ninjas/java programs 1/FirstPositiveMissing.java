import java.util.Arrays;

public class FirstPositiveMissing {
	public static void main(String[] args) {
		//int[] a = {3, 2, -6, 1, 0};
		int[] a = {0, 1, 2, 3, 4};
		int result = missing(a);
		System.out.println(result);
	}
	public static int missing(int[] a){
		Arrays.sort(a);
		int result = 0;
		for(int i = 0; i < a.length - 1; i++) {
		    if(a[i] > 0 && a[i] == a[i+1] - 1 ) {
		        result = a[i+1]+1;
		    }
		    else {
				result = a[i] + 1;
			}
		}
        return result;
	}
}


/*
if (n == 0) {
            return 1;
        }

        Arrays.sort(arr);
        int counter = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == counter) {
                counter++;
            }

            // Skip the negative number
            if (arr[i] < counter) {
                continue;
            }
            // First missing positive number
            else {
                break;
            }
        }

        return counter;
*/