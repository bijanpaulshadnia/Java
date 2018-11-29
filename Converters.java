package conversions;
//import extension

public class Converters extends UnnessaryExtension {

	public static double inchtocm(double b)

	{
		return b * (2.54);
	}

	public static double cmtoinch(double b) {

		return b / 2.54;
	}

	public static boolean check()//
	{
		return true;
	}

	public static double fahrenheittocelsius(double b)

	{
		double a = 5.0 / 9.0; // initialized for accuracy
		return a * (b - 32); // compute conversion

	}
public static double extension(double b)
{
	return ux(b);
}
	/*
	 * public static menu() { return System.out.println(); }
	 */
}
