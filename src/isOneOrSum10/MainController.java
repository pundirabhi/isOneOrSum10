package isOneOrSum10;

/*
 * ABHISHEK PUNDIR
 * 04 MARCH 2017
 * IsOneOrSum10 Project
 */
import java.util.Scanner;
import static java.lang.System.out;

public class MainController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter the two number a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean result = IsOneOrSum10.isOneOrSum10(a, b);
		out.println(" The Result is " + result);

	}

}
