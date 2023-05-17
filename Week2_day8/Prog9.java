// write a java program to read the boolean value and print the opposite value
import java.util.Scanner;
public class Prog9  {
  public static void main(String[] args) {
    boolean a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a value:");
    a=sc.nextBoolean();
    if(a==true)
    {
      System.out.println("False");
    }
    else
    {
      System.out.print("True");
    }
  }
}
  