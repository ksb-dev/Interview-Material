public class CountWords {

	public static void main(String[] args) {
		String s = "this is a sample string";

		int count = countWords(s);

		System.out.println(count);
	}

	public static int countWords(String str) {
		//Your code goes here
        if(str.length() == 0) {
            return 0;
        }

		char[] c = str.toCharArray();
		int count = 1;

		for(int i = 0; i < c.length; i++) {
			if(c[i] == ' ') count++;
		}

        return count;
	}

}