import java.util.Scanner; //import scanner

public class LengthConverter
{
public static void main (String [] args)
{
 String name; //initialize string "name"
	System.out.println("Please enter your name"); //request user name
Scanner scan0 = new Scanner (System.in); //initialize scanner "scan0"
	name = scan0.nextLine(); //"name" is "scan0"
System.out.println(name + ", Enter 1 for inch-to-cm, 2 for cm-to-inch:"); //request cm->in. or in.->cm
int x; //if-else flow controlled by user input
Scanner scan1 = new Scanner (System.in); //initialize user input as "scan 1"
x = scan1.nextInt(); //set user input to "scan1"


if (x==1) { //initialize if-else statement
	System.out.println("Enter the number of inches: "); //request cm from user
	double a; //user input variable
	double y; //product variable 
	Scanner scan2 = new Scanner (System.in); //accept inches, named "scan2"
	a = scan2.nextDouble(); //user input renamed to a
	y = a*2.54; //desired product
	System.out.println( y + "cm"); //print product with units
	
	
}
else { //initialize else
	double b; //user input variable
	double z; //product variable
	System.out.println("Enter the number of cm: "); //request cm from user
	Scanner scan3= new Scanner(System.in); //accept cm, named "scan3"
	 b = scan3.nextDouble(); //user input variable
	 z = b/2.54; //desired quotient
	System.out.println(z +"in."); //print quotient with units
}
}	//end method
}//end class