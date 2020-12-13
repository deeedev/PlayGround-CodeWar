package solvedkatas;

public class SpinWords {

	/*
	 * Method to find the Spin Words. Method is static because I'm using the driver
	 * code into the same class so that I can use the method into driver method
	 */

	public static String spinWords(String sentence) {
		// TODO: Code stuff here

		String str[] = sentence.split(" ");

		/*
		 * Loop to check the length of the words greater than five and then reverse it
		 */

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() >= 5) {
				String s = "";
				for (int j = str[i].length() - 1; j >= 0; j--) {
					s += str[i].charAt(j) + "";
				}
				str[i] = s;
			} else {
				continue;
			}
		}

		String reversedSentence = "";
		/* Loop to concat the reversed words into the final Sentence */

		for (int i = 0; i < str.length; i++) {
			/*
			 * Condition to ensure the space does not concatenated at the end of the
			 * sentence
			 */
			if (i <= str.length - 2) {
				reversedSentence += str[i] + " ";
			} else {
				reversedSentence += str[i];
			}
		}

		return reversedSentence;
	}

	public static void main(String[] args) {

		// Test cases from codewar
		String[] sentence = { "Welcome", "Hey fellow warriors", "This is a test", "This is another test",
				"This sentence is a sentence", "You are almost to the last test",
				"Just kidding there is still one more", "Seriously this is the last one" };

		for (int i = 0; i < sentence.length; i++) {
			String s = spinWords(sentence[i]);
		}
	}
}