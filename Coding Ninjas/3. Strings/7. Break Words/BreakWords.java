public class BreakWords {

	public static void main(String[] args) {
		String s = "Helloo world good morniing";

		String result = breakWords(s);

		System.out.println(result);
	}

	public static String breakWords(String input){

        String s = input.trim();

		if(input.length() == 0 || input == null) {
		    return "";
		}

		String[] words = s.split("\\s");
        String result = "";

		for(int i = 0; i < words.length; i++) {

			if(((words[i].length()) % 2 == 0) && (words[i].length()) >= 4) {

				int half = (words[i].length()) / 2;

				result += words[i].substring(0, half) + " " + words[i].substring(half) + " ";
			}
			else {
				result += words[i] + " ";
			}
		}

		return result;
	}
}