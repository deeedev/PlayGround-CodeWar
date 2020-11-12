public class DisemvowelTrolls {

	public static String disemvowel(String str) {
		// StringBuilder str1 = new StringBuilder(str);

		String s1 = str.replaceAll("[AEIOUaeiou]", "");

		return s1;
	}

	public static void main(String[] args) {
		String str = disemvowel("No offense but,\nYour writing is among the worst I've ever read");
		System.out.println(str);
	}
}
