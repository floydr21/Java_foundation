// Write a program that takes in two integers as input and outputs their sum if both the integers are even. If both integers are odd, output their product. If one of the integers is odd and the other is even, output their difference
import java.lang.Math;
import java.util.Scanner;
public class Prog4 {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first Integers:");
    int a=sc.nextInt();
    System.out.println("Enter the second Integers:");
    int b=sc.nextInt();
    if(a%2==0 && b%2==0)
    {
      int sum=a+b;
      System.out.println(sum);
    }
    else if((a%2!=0 && b%2==0)||(a%2==0 && b%2!=0))
    {
      int diff=a-b;
      System.out.println(diff);
    }
    else
    {
      int mult=a*b;
      System.out.println(mult);
    }
      
  }
}