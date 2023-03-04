import java.util.*;

public class ReturnAllCodes {
	public static void main(String[] args) {
		String s = "1123";
		String ans = "";

		ArrayList<String> list = new ArrayList<>();

		ArrayList<String> result = printCodes(s, ans, list);

		String[] array = result.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
	}

	private static ArrayList<String> printCodes(String str, String ans, ArrayList<String> list) {

	    if (str.length() == 0) {
	        list.add(ans);
	        return list;
	    }

	    String ch1 = str.substring(0, 1);
	    String restOfTheString1 = str.substring(1);

	    if (Integer.parseInt(ch1, 10) > 0) {
	        char code = (char) (Integer.parseInt(ch1, 10) + 'a' - 1);
	        printCodes(restOfTheString1, ans + code, list);
	    }

	    if (str.length() >= 2) {
	        String ch12 = str.substring(0, 2);
	        String ros2 = str.substring(2);

	        if (Integer.parseInt(ch12, 10) > 0 && Integer.parseInt(ch12) <= 26) {
	            char code = (char) (Integer.parseInt(ch12, 10) + 'a' - 1);
	            printCodes(ros2, ans + code, list);
	        }

	        if (Integer.parseInt(ch12, 10) == 0) {
	            printCodes(ros2, ans, list);
	        }
	    }
	    return list;
     }
}