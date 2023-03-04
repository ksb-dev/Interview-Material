import java.util.Arrays;

class TestNextPermutation{

    public static int[] swap(int data[], int left, int right){

        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        return data;
    }

    public static int[] reverse(int data[], int left, int right){

        while (left < right) {

            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;

        }

        return data;
    }

    public static boolean findNextPermutation(int data[]){

        // If the given dataset is empty or contains only one element next_permutation is not possible

        if (data.length <= 1)
            return false;

        int last = data.length - 2;

        // scan from right to left, find the first element that is less than its previous one (p).

        while (last >= 0){

            if (data[last] < data[last + 1]){

                break;
            }

            last--;
        }

        // If there is no element that is less than previous one then permutation is not possible.

        if (last < 0)
            return false;

        int nextGreater = data.length - 1;

        // scan from right to left, find the first element that is greater than previous one (q) & assign it to a variable.

        for (int i = data.length - 1; i > last; i--){

            if (data[i] > data[last]){

                nextGreater = i;
                break;
            }
        }

        // swap p and q

        data = swap(data, nextGreater, last);

        //  reverse elements [p+1, nums.length - 1]

        data = reverse(data, last + 1, data.length - 1);

        // Return true as the next_permutation is done

        return true;
    }
}

public class NextPermutation{

	public static void main(String args[]){

		    TestNextPermutation t = new TestNextPermutation();

	        int data[] = {4, 5, 6, 3, 2, 1};

	        boolean result = t.findNextPermutation(data);

	        if (!result){

				System.out.println("There is no higher order permutation for the given data.");
			}
	        else{
	            System.out.println(Arrays.toString(data));
	        }
    }
}