// to calculate sum of digits of an integer
import java.util.Scanner;
public class Prog11 {
  public static void main(String[] args) {
    int sum=0,digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer:");
    int num=sc.nextInt();
    while(num>0)
      {
        digit=num%10;
        sum=digit+sum;
        num=num/10;
      }
    System.out.println("The sum of Integers:"+sum);
    
  }
}