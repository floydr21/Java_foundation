// WAP to count number of digits in a number.
import java.util.Scanner;
public class Prog26 {
  public static void main(String[] args) {
    Digit dt=new Digit();
    dt.noOfDigit();
    
  }
}
class Digit {
  public void noOfDigit() {
    Scanner sc=new Scanner(System.in);
    int num,digit,temp=0;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    if(num>0) {
      do {
        digit=num%10;
        temp=temp+1;
        num=num/10;
      
      }
      while(num!=0);
    }
    System.out.println("the number of digits:"+temp);
  }
}