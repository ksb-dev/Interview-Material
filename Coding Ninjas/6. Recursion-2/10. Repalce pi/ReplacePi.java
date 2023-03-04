public class ReplacePi {
	public static void main(String[] args) {
		String s = "pikedarpipixpi";
		System.out.println(replacePi(s));
	}
	// Return the changed string
	public static String replacePi(String str){
		// Write your code here
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == 'p' && str.length() >= 2
            && str.charAt(1) == 'i') {
            return "3.14" + replacePi(str.substring(2, str.length()));
        }

        return str.charAt(0) + replacePi(str.substring(1, str.length()));
	}
}