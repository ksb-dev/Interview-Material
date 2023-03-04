public class CountNumberOfZeroesInDigitUsingRecursion {
    static int count = 0;

    public static void main(String[] args) {
		//int digit = 708000;
		int digit = 0;

		int result = countZerosRec(digit);

		System.out.println(result);
	}

	public static int countZerosRec(int input){
		// Write your code here
        if(input < 10) {

            if(input == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
        if((input % 10) == 0) {

			return (1 + countZerosRec(input / 10));
		}
		else {
			return countZerosRec(input / 10);
		}
	}
}