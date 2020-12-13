
public class ConvertString {

	/* Method to convert String into camelCase */
	static String toCamelCase(String s) {

		// Split the String into Array by dash/underscore delimited words
		String s1[] = s.split("[-_]");

		// Store the first Word into final String "str" as it is not varrying
		String str = s1[0] + " ";

		// loop into String array and Convert the first Letter into Upper Case
		for (int i = 1; i < s1.length; i++) {

			str += s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1) + " ";

		}

		return str;
	}

	public static void main(String[] args) {

		String str[] = { "the-Stealth-Warrior", "the_Stealth_Warrior",
				"You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields" };

		for (int i = 0; i < str.length; i++) {
			String s = ConvertString.toCamelCase(str[i]);
			System.out.println(s);
		}

	}
}
