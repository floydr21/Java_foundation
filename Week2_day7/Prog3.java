// WAP to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
public class Prog3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    if(num%5==0 && num%11==0)
      {
         System.out.println("Divisible by 5 or 11");
      }
    else{
      System.out.println("not divisible by 5 or 11");
    }
    
  }
}