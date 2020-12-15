package solvedkatas;

public class BouncingBall {

	/* Method to check the no of bounce occurs */
	public static int bouncingBall(double h, double bounce, double window) {

		int no_of_bounce;
		/*
		 * return -1 if any of the three condition not met. 1.. h should be greater than
		 * 0 2..bounce should be greater than 0 and less than 1 3.. Window should not be
		 * equal or greater than h
		 */
		if (h < 0 || bounce < 0 || bounce >= 1 || window >= h) {
			no_of_bounce = -1;
		} else {
			int count = 0;
			while (h > window) {
				h = h * bounce;
				count++;
			}
			no_of_bounce = 2 * count - 1;
		}

		return no_of_bounce;
	}
}
