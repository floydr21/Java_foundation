//  WAP to enter a number and print its reverse.
import java.util.Scanner;
public class Prog7 {
  public static void main(String[] args) {
    Reverse rv=new Reverse();
    rv.reverseNumber();
  }
}
class Reverse {
  public void reverseNumber() {
    Scanner sc=new Scanner(System.in);
    int num,rev_number=0,digit;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    
      do {
        digit=num%10;
        rev_number=(rev_number*10)+digit;
        num=num/10;
      }
      while(num>0);
     System.out.println("The reverse:"+rev_number);
    }
    
  }
// num 1 rev_number-521, digit=1