package solvedkatas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BreakCamelCase {
	public static String camelCase(String input) {

		StringBuilder str = new StringBuilder(input);
		String result = "";

		/* Pattern will check for the upper case letter into the String */
		Pattern pat = Pattern.compile("[A-Z]");
		int j = 0;

		/*
		 * Condition to check for the upper case letter and concat substring into final
		 * result String
		 */
		for (int i = 0; i < str.length(); i++) {
			Matcher mat = pat.matcher(str.charAt(i) + "");
			String s;

			if (mat.matches() || i == str.length() - 1) {
				if (i == str.length() - 1) {
					s = str.substring(j);
					result += s;
				} else {
					s = str.substring(j, i);
					result += s + " ";
					j = i;
				}
			}
		}

		return result;
	}
}