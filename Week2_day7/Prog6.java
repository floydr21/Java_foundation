//Leap Year Checker: Create an application that takes a year as input and checks if it's a leap year. Use conditional statements to determine if the year is a leap year based on the rules for determining leap years.
import java.util.Scanner;
public class Prog6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year:");
    int year=sc.nextInt();
    if(year%4==0 || year%100==0 || year%400==0 )
    {
      //if(year%100==0)
     // {
       // if(year%400==0)
       // {
          
      //  }
     // }
      System.out.println("Leap Year");
    }
    else
    {
      System.out.println("Not a Leap Year");
    }
      
  }
}