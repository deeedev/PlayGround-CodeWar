import java.util.Scanner;

public class SquareDigit {

	public static int squareDigits(int n) {

		String num = Integer.toString(n);
		String sqdigit = "";
		for (int i = 0; i < num.length(); i++) {
			int d = Integer.parseInt(num.charAt(i) + "");
			int sq = d * d;
			sqdigit += Integer.toString(sq);
		}

		return Integer.parseInt(sqdigit);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(squareDigits(n));
	}

}