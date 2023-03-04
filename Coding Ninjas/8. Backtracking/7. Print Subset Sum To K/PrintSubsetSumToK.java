public class PrintSubsetSumToK {

	public static void main(String[] args) {
		int[] input = {5, 12, 3, 17, 1, 18, 15, 3, 17 };
		printSubsetsSumTok(input, 6);
	}

	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        checkSubsets(input, 0, "", 0, k);

	}
    public static void checkSubsets(int[] arr, int index, String set, int sos, int target) {
		if(index == arr.length) {
			if(sos == target) {
				System.out.println(set);
			}
			return;
		}
		checkSubsets(arr, index + 1, set + arr[index]+" ", sos + arr[index], target);
		checkSubsets(arr, index + 1, set, sos, target);
	}
}