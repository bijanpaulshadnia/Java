/* Authored by Bijan P. Shadnia
 * Tuesday, November 19th, 2019
 * Daily Project: Arithmetic Calculator
 */
import java.util.Scanner; // import the scanner
public class dailyproject
{
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); 
    
    while(true){
    System.out.println("1-add"); // menu
    System.out.println("2-subtract");
    System.out.println("3-multiply");
    System.out.println("4-divide");
    
    
    int a = s.nextInt(); // accept user input
    if (a==1){
  System.out.println("Enter a number to be added");
  int b = s.nextInt(); // first number to be added
  System.out.println("Enter a second number to be added");
  int c = s.nextInt(); // second number to be added
  int d = b + c;
  System.out.println("The sum is " + d+"."); // print user input
    }
    if (a==2){
       System.out.println("Enter a number");
  int e = s.nextInt(); // first number
  System.out.println("Enter a second number to subtract");
  int f = s.nextInt(); // second number to be subtracted
  int g = e-f;
  System.out.println("The difference is " + g+"."); // print user input 
    }
    if (a==4){
         System.out.println("Enter a dividend");
  int h = s.nextInt(); // enter dividend
  System.out.println("Enter a divisor");
  int i = s.nextInt(); // enter divisor
  int j = h/i;
  System.out.println("The quotient is " + j+"."); // print user input
      
    }
    if (a==3){
      
     System.out.println("Enter a number to multiply");
  int n = s.nextInt(); // first number
  System.out.println("Enter a second number to multiply");
  int o = s.nextInt(); // multiplied by
  int p = n*o;
  System.out.println("The quotient is " + p+"."); // print user input
    }
}
}
}