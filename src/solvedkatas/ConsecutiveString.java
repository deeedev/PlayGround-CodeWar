package solvedkatas;

import java.util.Arrays;
import java.util.Comparator;

class ConsecutiveStringc {

	public static String longestConsec(String[] strarr, int k) {
		// your code

		/*
		 * Check for the value of k if greater that array size or less than or equal to
		 * 0
		 */
		if (k <= 0 || k > strarr.length) {
			return "";
		}
		/* if k equal to length of array return the whole concatenated string */
		else if (k == strarr.length) {
			String s = "";
			for (int i = 0; i < strarr.length; i++) {
				s += strarr[i];
			}
			return s;
		} else {
			/* Concatenate the String as per the k */
			String str[] = new String[strarr.length - k + 1];
			for (int i = 0; i < strarr.length - k + 1; i++) {
				String temp_str = "";
				for (int j = i; j < i + k; j++) {
					temp_str += strarr[j];
				}
				str[i] = temp_str;
			}

			/* Compare the array as per the string length */
			Comparator<String> com = new Comparator<String>() {

				@Override
				public int compare(String s1, String s2) {
					if (s1.length() > s2.length())
						return 1;
					else if (s1.length() == s2.length())
						return 0;
					else
						return -1;
				}

			};

			/* Sort the array as per the String length */
			Arrays.sort(str, com);

			/* Condition to return the lasrgest length as first came order */
			int p = str.length - 1;
			int pos = str.length - 1;
			while (str[p].length() == str[p - 1].length()) {
				if (str[p - 1].length() > str[p - 2].length()) {
					pos = p - 1;
				}
				p--;
			}

			return str[pos];

		}
	}
}