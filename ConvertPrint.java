package conversions;

/*Function: Forwards/Backwards conversion for inch-cm.
 -calls Converters methods
 */
import java.util.Scanner;

public class ConvertPrint extends Converters {
	public static void main(String[] args) {

		// System.out.println("Enter the number of inches: ");
		boolean x = true;
		do {
			double a, b, c, d;
			Scanner scan0 = new Scanner(System.in);
			// double a, b, c, d;
			System.out.println(" ");
			System.out.println("1: inches to cm");
			System.out.println("2: cm to inches");
			System.out.println("3: Fahrenheit to Celsius");
			System.out.println("4: dummy");
			a = scan0.nextDouble();
			if (a == 1) {
				System.out.println("Enter the number of inches: ");
				b = scan0.nextDouble();
				System.out.println(b + "in. = " + inchtocm(b) + "cm");
			}
			if (a == 2) {
				System.out.println("Enter the number of cm: ");
				b = scan0.nextDouble();
				System.out.println(b + "cm = " + cmtoinch(b) + "in.");
			}
			if (a == 3) {
				System.out.println("Enter the temperature in Fahrenheit: ");

				b = scan0.nextDouble();
				System.out.println(b + "ºF = " + fahrenheittocelsius(b) + "Cº");
			}
			if (a == 4) {
				System.out.println("enter a number to be multiplied by 2");
				b= scan0.nextDouble();
				System.out.println(extension(b));
			}
		} while (x = true);

	} // main method
}// class
