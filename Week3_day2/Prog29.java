// WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Prog29 {
  public static void main(String[] args)
  {
    Palindrome p=new Palindrome();
    p.pali();
  }
}
class Palindrome {
  public void pali() {
    Scanner sc=new Scanner(System.in);
    int n,digit,rev_number=0;
    System.out.pritnln("Enter a number:");
    n=sc.nextInt();
    int temp=n;
    while(n!=0)
      {
        digit=number%10;
        rev_number=rev_number*10+digit;
        n=n/10
      }
    if(rev_number==temp)
    {
      System.out.pritnln("Palindrome");
    }
    else 
      System.out.pritnln("Not Palindrome");
  }
}