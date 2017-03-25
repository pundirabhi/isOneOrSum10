package isOneOrSum10;

/*
 * ABHISHEK PUNDIR
 * 04 MARCH 2017
 * IsOneOrSum10 Project
 */
public class IsOneOrSum10 {
	public static boolean isOneOrSum10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		} else {
			return false;
		}
	}

}
