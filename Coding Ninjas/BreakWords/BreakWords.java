public class BreakWords {
	public static void main(String[] args) {

		String input = "aabbcd efg hi jklm nopqrst uv wxyb a ";
		String s = input.trim();
		String result = "";

		if(input.length() == 0 || input == null) {
		    return;
		}

		String[] words = s.split("\\s");

		for(int i = 0; i < words.length; i++) {
			if(((words[i].length()) % 2 == 0) && (words[i].length()) >= 4) {
				int half = (words[i].length()) / 2;

				result += words[i].substring(0, half) + " " + words[i].substring(half) + " ";
				System.out.println(words[i].substring(0, half) + " " + words[i].substring(half));
			}
			else {
				result += " " + words[i] + " ";
			}
		}

		System.out.println(result);
	}
}