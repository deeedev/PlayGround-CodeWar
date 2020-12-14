package solvedkatas;

public class Order {
	public static String order(String words) {
		// ...

		/* Condition to check if String is empty */
		if (words == "") {
			return "";
		} else {

			String[] str = words.split(" ");
			String[] str1 = new String[str.length];

			/*
			 * Loop to check the number and store into new array as per the required index
			 */
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length(); j++) {

					if (Character.isDigit(str[i].charAt(j))) {
						int n = Integer.parseInt(str[i].charAt(j) + "");
						str1[n - 1] = str[i];

					}
				}
			}

			String newStr = "";

			/* Loop to concat the string from array into Complete String */
			for (int i = 0; i < str.length; i++) {
				if (i == str.length - 1) {
					newStr += str1[i];
				} else {
					newStr += str1[i] + " ";
				}
			}
			return newStr;
		}
	}
}