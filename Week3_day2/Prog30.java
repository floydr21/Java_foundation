// WAP to calculate sum of digits of a number.
import java.util.Scanner;
public class Prog30 {
  public static void main(String[] args) {
    Digit d=new Digit();
    d.sumDigit();
  }
}
class Digit {
  public void sumDigit() {
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