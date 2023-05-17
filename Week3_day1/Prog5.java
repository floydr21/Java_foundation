// WAP to calculate sum of digits of a number.
import java.util.Scanner;
public class Prog5 {
  public static void main(String[] args) {
    Digit dt=new Digit();
    dt.SumDigit();
    
  }
}
class Digit {
  public void SumDigit() {
    Scanner sc=new Scanner(System.in);
    int num,sum=0,digit;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    if(num>0) {
      do {
        digit=num%10;
        sum=sum+digit;
        num=num/10;
      
      }
      while(num!=0);
    }
    System.out.println("The sum:"+sum);
  }
}