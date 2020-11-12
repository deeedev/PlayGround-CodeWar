import java.util.Scanner;

public class BitCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int binary = 0;

		while (n > 0) {
			int rem = n % 2;
			binary = rem * 10 + binary;
			n = n / 2;
		}

		System.out.println(binary / 10);
	}

}
