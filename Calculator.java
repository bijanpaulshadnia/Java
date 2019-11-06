import java.util.Scanner;

public class Calculator
  
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner (System.in);
    
    while (true){
      System.out.println("press");
      System.out.println("1-add");
      System.out.println("2-subtract");
      System.out.println("3-divide");
      System.out.println("4-multiply");
  //    System.out.println("5-(return method call)*blue book");
      int in = s.nextInt();
      
      if (in ==1){
        System.out.println("Enter a number to be added");
        int a = s.nextInt();
        System.out.println("Enter a second number");
        int b = s.nextInt();
        
        int c = a + b;
        System.out.println("the sum of the first and second number is " + c ); 
      }
      
      if (in==2){
        System.out.println("Enter a number to be subtracted");
        int d = s.nextInt();
        System.out.println("Enter a second number");
        int e = s.nextInt();
        
        int f = d - e;
        System.out.println("the difference between the first and second number is " + f ); 
      }
      
      if (in==3){
        System.out.println("Enter a number to be divided");
        int d = s.nextInt();
        System.out.println("Enter a second number");
        int e = s.nextInt();
        
        int f = d / e;
        System.out.println("the quotient of the first and second number is " + f ); 
      }
      
      if (in==4){
        System.out.println("Enter a number to be multiplied");
        int d = s.nextInt();
        System.out.println("Enter a second number");
        int e = s.nextInt();
        
        int f = d * e;
        System.out.println("the product of the first and second number is " + f ); 
      }
      if(in==5){
      //return (methodcall());
      }
      
      
    }
    
  }
}