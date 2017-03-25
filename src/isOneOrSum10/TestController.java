package isOneOrSum10;

/*
 * ABHISHEK PUNDIR
 * 04 MARCH 2017
 * IsOneOrSum10 Project
 */
import static java.lang.System.out;

public class TestController {
	public static void main(String[] args) {

		// isOneOrSum10(10, 5) Condition
		boolean result = IsOneOrSum10.isOneOrSum10(10, 5);
		if (result == true) {
			out.println("The passed values are (10, 5) " + result + " the test -> passes");
		} else {
			out.println("The passed values are (10, 5) " + result + " the test -> fails");
		}
		// isOneOrSum10(2, 10) Condition
		result = IsOneOrSum10.isOneOrSum10(2, 10);
		if (result == true) {
			out.println("The passed values are (2, 10) " + result + " the test -> passes");
		} else {
			out.println("The passed values are (2, 10) " + result + " the test -> fails");
		}
		// isOneOrSum10(5, 5) Condition
		result = IsOneOrSum10.isOneOrSum10(5, 5);
		if (result == true) {
			out.println("The passed values are (5, 5) " + result + " the test -> passes");
		} else {
			out.println("The passed values are (5, 5) " + result + " the test -> fails");
		}
		// isOneOrSum10(2, 5) Condition
		result = IsOneOrSum10.isOneOrSum10(2, 5);
		if (result == false) {
			out.println("The passed values are (2, 5) " + result + " the test -> passes");
		} else {
			out.println("The passed values are (2, 5) " + result + " the test -> fails");
		}
	}

}
