
public class PrintAllSubStrings {

	public static void main(String[] args) {
		String s = "abc";

		printSubstrings(s);
	}

	public static void printSubstrings(String str) {
		//Your code goes here
        if(str.length() == 0 || str == null) {
            return;
        }

        for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				System.out.println(str.substring(i, j+1));
			}
		}
	}
}