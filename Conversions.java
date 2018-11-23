import java.util.Scanner;												//initialize scaner

public class Conversions {


public static void main(String []args)
{
	
Scanner scan0 = new Scanner(System.in);									//set user input = scan0
																		//initialize double x
double x;																//
System.out.println("Enter # of inches for the conversion to cm:");		//request input
x = scan0.nextDouble();													//rename input as x
System.out.println(inchtocm(x));										//print function output
System.out.println("Enter temerature in F for the conversion to C:");
double y;
Scanner scan1 = new Scanner(System.in);
y = scan1.nextDouble();
System.out.println(ftoc(y));											//
}																		//end 



public static double inchtocm(double x)									//initialize function
																		//
{																		//
	return x*(2.54);													//compute
}																		//end function

public static double ftoc(double y)
{
	return (y-32)*(5/9);												//compute c=(x-32)*(5/9)		


}
}


																		//end flow



