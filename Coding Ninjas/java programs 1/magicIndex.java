/*
    Time Complexity: O(N)
    Space Complexity: O(1)

    Where N is the number of elements in the array.
*/
import java.util.ArrayList;

public class Solution 
{
    public static int magicIndex(ArrayList<Integer> a, int n) 
    {
        // Variable to store the answer
        int ans = -1;
        for (int i = 0; i < n; i++) 
        {
            // If we find a magic index we will assign it to our answer variable
            if (a.get(i) == i) 
            {
                ans = i;

                // After finding the least magic index we will break from the loop
                break;
            }
        }

        // Return the answer
        return ans;
    }

}