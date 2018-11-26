//last mod 11/26/18
import java.util.Scanner; 
public class Conversions {
public static void main(String []args)
{
Scanner scan0 = new Scanner(System.in);	//allow user input
			
double x; //for user input																															
System.out.println("Enter # of inches for the conversion to cm:"); 
x = scan0.nextDouble();	//rename user input
System.out.println(x + "in." + " = " + inchtocm(x) + "cm");	//print conversion

double y;	//for user input
System.out.println("Enter temerature in F for the conversion to C:"); 
Scanner scan1 = new Scanner(System.in);	//allow user input
y = scan1.nextDouble();	//rename user input
System.out.println(y + "°F = " + ftoc(y) + "°C");	//print conversion
}																		


public static double inchtocm(double x)	//initialize function
																		
{																		
	return x*(2.54); //compute conversion
}																		

public static double ftoc(double y)	//initialize function ftoc
{																		
	double a = 5.0/9.0;	//initialized for accuracy 
	return  a*(y-32);	//compute conversion

}
}
																		



