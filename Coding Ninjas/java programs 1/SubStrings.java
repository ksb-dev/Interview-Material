public class SubStrings {
	static String s;
	public static void main(String[] args) {



		System.out.println(s == null);

		for(int i = 0; i < s.length(); i++) {
			for(int j = i; j < s.length(); j++) {
				System.out.println(s.substring(i, j+1));
			}
		}
	}
}