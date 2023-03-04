import java.util.*;

public class LargestUniqueSubString {

	public static void main(String[] args) {
		String s = "abcdabceb";

		String result = findLargestUniqueSubstring(s);

		System.out.println(result);
	}

	public static String findLargestUniqueSubstring(String str){

        int i;
        int n = str.length();
        int st = 0;
        int currlen = 0;
        int maxlen = 0;
        int start = 0;

        HashMap<Character, Integer> pos = new HashMap<Character, Integer>();

        pos.put(str.charAt(0), 0);

        for (i = 1; i < n; i++) {

            if (!pos.containsKey(str.charAt(i))) {
                pos.put(str.charAt(i), i);
            }

            else {

                if (pos.get(str.charAt(i)) >= st) {
					System.out.println("i : "+i);
					System.out.println("currlen : "+currlen);
					System.out.println("pos.get(str.charAt(i)) : "+pos.get(str.charAt(i)));

                    currlen = i - st;

                    System.out.println("currlen : "+currlen);

                    if (maxlen < currlen) {
                        maxlen = currlen;
                        System.out.println("maxlen : "+maxlen);
                        start = st;
                        System.out.println("start : "+start);
                    }

                    st = pos.get(str.charAt(i)) + 1;
                    System.out.println("st : "+st);
                }
                System.out.println(pos);
                pos.replace(str.charAt(i), i);
                System.out.println(pos);

                System.out.println("--------------");
            }
        }


        if (maxlen < i - st) {
            maxlen = i - st;
            start = st;
        }

        return str.substring(start, start + maxlen);
	}
}