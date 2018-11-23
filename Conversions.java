import java.util.Scanner;												//initialize scaner
public class Conversions {
public static void main(String []args)
{
Scanner scan0 = new Scanner(System.in);									//set user input = scan0
																		//initialize double x
double x;																//
System.out.println("Enter # of inches for the conversion to cm:");		//request input
x = scan0.nextDouble();													//rename input as x
System.out.println(x + "in." + " = " + inchtocm(x) + "cm");				//print function output
System.out.println("Enter temerature in F for the conversion to C:");	//print "x"
double y;																//initialize double y
Scanner scan1 = new Scanner(System.in);									//initalize scan1
y = scan1.nextDouble();													//rename input as y
System.out.println(y + "°F = " + ftoc(y) + "°C");							//print ftoc(y)
}																		//end 



public static double inchtocm(double x)									//initialize function
																		//
{																		//
	return x*(2.54);													//compute
}																		//end function



public static double ftoc(double y)										//initialize function ftoc
{																		//
	return (y-32)*(0.55555555555555555555555555555555555555555555555);	//compute c=(x-32)*(5/9).     (0.5555 is approx. 5/9)		


}
}
																		//end flow



