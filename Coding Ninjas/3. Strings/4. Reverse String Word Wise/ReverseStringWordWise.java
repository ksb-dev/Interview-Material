public class ReverseStringWordWise {

	public static void main(String[] args) {
		String s = "course preparation interview ninjas coding";

		String result = reverseWordWise(s);

		System.out.println(result);
	}
	public static String reverseWordWise(String input) {

        if(input.length() == 0 || input == null) {
            return "";
        }

        String[] words = input.split("\\s");

		String output = "";

		for (int i = words.length-1; i >= 0; i--) {
		    output = output + words[i] + " ";
		}
        return output;
	}
}