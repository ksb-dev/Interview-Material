import java.util.Scanner;
import java.util.*;

public class AlphaCode {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        /*String[] input = new String[sc.nextInt()];

        sc.nextLine(); ;

        for (int i = 0; i < input.length; i++) {
		    input[i] = sc.nextLine();
        }

        alphaCode(input);*/

        Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String[] tokens = scanner.nextLine().split("\\s");
			String firstLetter = tokens[0].substring(0, 1);

			if(firstLetter.equals("0")){
				break;
			}
			alphaCode(tokens);
		}
        scanner.close();
	}

	public static void alphaCode(String[] input) {

		//for(int k = 0; k < input.length; k++) {

			char[] digits = input[0].toCharArray();
			int n = digits.length;

			int count[] = new int[n + 1];

			count[0] = 1;
			count[1] = 1;

			if(digits[0] == '0')
			  return;

			for (int i = 2; i <= n; i++) {
				count[i] = 0;

				if (digits[i - 1] > '0')
					count[i] = count[i - 1];

				if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7'))
					count[i] += count[i - 2];
			}
		System.out.println(count[n]);
		//}
	}
}

/*25114
1111111111
3333333333
0*/